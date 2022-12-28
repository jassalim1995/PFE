package com.Backend.Shema.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Shema.Model.Client;
import com.Backend.Shema.Repositories.ClientRepository;




@Service
public class ClientService {

	@Autowired
	private ClientRepository cs;
	
	public Client addClient(Client cser) {
		return cs.save(cser);
	}

	public List<Client> FindAllClients()
	{
		return cs.findAll();
	}
 
	public Optional<Client> FindClientById(String id){
    	return cs.findById(id);
    			
    }
	public Client findClientByMail(String name) {
		return cs.findClientByClient(name);
	}

}
