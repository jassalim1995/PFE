package com.Backend.Shema.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Shema.Model.Agent;
import com.Backend.Shema.Repositories.AgentRepository;





@Service
public class AgentService {

	@Autowired
	private AgentRepository as;
	
	public Agent addAgent(Agent user) {
		return as.save(user);
	}

	public List<Agent> FindAllAgents()
	{
		return as.findAll();
	}
 
	public Optional<Agent> FindAgentById(String id){
    	return as.findById(id);
    			
    }
	
	
}
