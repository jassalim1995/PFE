package com.Backend.Test.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Test.Model.Clients;
import com.Backend.Test.Repositories.ClientsRepository;

@Service
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
