package com.Backend.Test.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Backend.Test.Model.Clients;
import com.Backend.Test.Repositories.ClientsRepository;

public class ClientsService {

	@Autowired
	private ClientsRepository ClientsRepository;
	
	public Clients add(Clients client) {
		return ClientsRepository.save(client);
	}
	
	public void deleteAll() {
		ClientsRepository.deleteAll();
	}
	
	public List<Clients> FindAll()
	{
		return ClientsRepository.findAll();
	}
}
