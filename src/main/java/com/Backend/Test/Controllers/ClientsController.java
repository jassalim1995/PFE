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

import com.Backend.Test.Model.Clients;
import com.Backend.Test.Services.ClientsService;

@RestController
@CrossOrigin
@RequestMapping("/clients")
public class ClientsController {
	
	@Autowired
	private ClientsService ClientsService;

	@PostMapping("/add")
	public Clients add(@RequestBody Clients client)
	{
		return ClientsService.add(client);
	}
	
	@DeleteMapping("delete")
	public void Delete()
	{
		ClientsService.deleteAll();
	}
	
	@GetMapping("/all")
	public List<Clients> FindAll() 
	{
		return ClientsService.FindAll();
	}

}
