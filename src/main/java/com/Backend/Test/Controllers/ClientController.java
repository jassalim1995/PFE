package com.Backend.Test.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.Test.Model.Client;
import com.Backend.Test.Model.Entreprise;
import com.Backend.Test.Services.ClientService;
import com.Backend.Test.Services.SequenceGenerator;

@RestController
@CrossOrigin
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientService ClientService;
	
	@Autowired
	private SequenceGenerator sequenceGenerator;
	
	@PostMapping("/add")
	public Client add(@RequestBody Client client)
	{
		client.setId(sequenceGenerator.generateSequence(Client.SEQUENCE_NAME));
		return ClientService.add(client);
	}
	
	@DeleteMapping("delete")
	public void Delete()
	{
		ClientService.deleteAll();
	}
	
	@GetMapping("/all")
	public List<Client> FindAll() 
	{
		return ClientService.FindAll();
	}

	@GetMapping("/{id}")
	public Client GetById(@PathVariable long id) {
		
		return ClientService.findById(id);
					
	}

}
