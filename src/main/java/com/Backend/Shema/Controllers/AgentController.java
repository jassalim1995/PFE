package com.Backend.Shema.Controllers;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Backend.Shema.Model.Agent;
import com.Backend.Shema.Services.AgentService;

@RestController
@CrossOrigin
@RequestMapping("/agent")

public class AgentController {
	

	@Autowired
	private AgentService as;
	
	@PostMapping("/ajouter")
	public Agent add(@RequestBody Agent user)
	{
		return as.addAgent(user);
	}
	
	@GetMapping("/all")
	public List<Agent> FindAll() 
	{
		return as.FindAllAgents();
	}
		
	@GetMapping("/findById/{id}") 
	public Optional<Agent> Findwf(@PathVariable(name="id") String id) 
	{
		return as.FindAgentById(id);
	}	
	
	@PutMapping("update/{id}")
    public ResponseEntity<Agent> update(@PathVariable("id") String id, @RequestBody Agent user) {
		Agent updated = as.addAgent(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

