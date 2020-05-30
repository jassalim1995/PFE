package com.Backend.Test.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Test.Model.Client;
import com.Backend.Test.Model.Conversation;
import com.Backend.Test.Repositories.ClientRepository;
	
@Service
public class ClientService {

	
	@Autowired
	private ClientRepository ClientRepository;
	
	public Client add(Client client) {
		return ClientRepository.save(client);
	}
	
	public void deleteAll() {
		ClientRepository.deleteAll();
	}
	
	public List<Client> FindAll()
	{
		return ClientRepository.findAll();
	}

	public Client findById(long id) {
		List<Client> clients = FindAll();
		for(Client client : clients)
			if(client.getId() == id)
				return client;
		return null;
	}
}
