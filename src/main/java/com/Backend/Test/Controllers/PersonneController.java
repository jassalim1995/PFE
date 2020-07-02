package com.Backend.Test.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.Test.Model.Personne;
import com.Backend.Test.Model.Technologie;
import com.Backend.Test.Services.PersonneService;

@RestController
@CrossOrigin
@RequestMapping("/personne")
public class PersonneController {
	
	@Autowired
	private PersonneService PersonneService;

	@PostMapping("/add")
	public Personne add(@RequestBody Personne Personne)
	{
		return PersonneService.add(Personne);
	}
	
	@DeleteMapping("delete")
	public void Delete()
	{
		PersonneService.deleteAll();
	}
	
	@GetMapping("/all")
	public List<Personne> FindAll() 
	{
		return PersonneService.FindAll();
	}
	@GetMapping("/finByName") 
	public Personne FindByName(@RequestParam(name="nom") String name) 
	{
		return PersonneService.FindByName(name);
	}
	
	@GetMapping("/findUser")
	public List<Personne> Find(@RequestParam(name = "techno") List<String> techno, @RequestParam(name = "tags") List<String> tags, @RequestParam(name = "actions") List<String> actions) {
		return PersonneService.fin(techno,tags,actions);
	}

}
