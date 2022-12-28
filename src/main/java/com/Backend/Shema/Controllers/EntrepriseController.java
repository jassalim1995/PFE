package com.Backend.Test.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.Test.Model.Entreprise;
import com.Backend.Test.Services.EntrepriseService;
import com.Backend.Test.Services.SequenceGenerator;
import com.Backend.Test.Repositories.EntrepriseRepository;

@RestController
@CrossOrigin
@RequestMapping("/entreprise")
public class EntrepriseController {
	
	@Autowired
	private EntrepriseService EntrepriseService;
	
	@Autowired
	private SequenceGenerator sequenceGenerator;
	
	@PostMapping("/add")
	public Entreprise add(@RequestBody Entreprise entreprise)
	{
		entreprise.setId(sequenceGenerator.generateSequence(Entreprise.SEQUENCE_NAME));
		return EntrepriseService.add(entreprise);
	}
	
	@DeleteMapping("delete")
	public void Delete()
	{
		 EntrepriseService.deleteAll();
	}
	
	@GetMapping("/all")
	public List<Entreprise> FindAll() 
	{
		return EntrepriseService.FindAll();
	}

}
