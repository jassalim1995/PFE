package com.Backend.Test.Controllers;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Backend.Test.Model.Besoin;
import com.Backend.Test.Model.Client;
import com.Backend.Test.Services.BesoinService;
import com.Backend.Test.Services.SequenceGenerator;

@RestController
@CrossOrigin
@RequestMapping("/besoin")
public class BesoinController {
	
	private final Path root = Paths.get("uploads");
	@Autowired
	private BesoinService BesoinService;
	
	@Autowired
	private SequenceGenerator sequenceGenerator;
	
	@PostMapping("/add")
	public Besoin add(@RequestParam("cv") MultipartFile file, @RequestParam("besoin") String besoin, @RequestParam("ao") String ao, @RequestParam("statut") String statut) throws IOException
	{
		
		Besoin bes = new Besoin();
		bes.setId(sequenceGenerator.generateSequence(Besoin.SEQUENCE_NAME));
		bes.setBesoin(besoin);
		bes.setAO(ao);
		bes.setStatut(statut);
		return BesoinService.save(bes, file);
	}
	
	/*@DeleteMapping("delete")
	public void Delete()
	{
		BesoinService.deleteAll();
	}*/
	
	
	/*@GetMapping("/open/{name}")
	public URI getFile(@PathVariable String name) throws IOException {
		 Path file = root.resolve(name);
	      Resource resource = new UrlResource(file.toUri());
	      System.out.println(resource.getURI());
			return resource.getURI();
	}*/
	
	@GetMapping("/all")
	public List<Besoin> FindAll() 
	{
		return BesoinService.findAll();
	}
	
	@DeleteMapping("delete")
	public void Delete()
	{
		BesoinService.Delete();
	}


}
