package com.Backend.Shema.Controllers;
import java.util.List;
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

import com.Backend.Shema.Model.Link;
import com.Backend.Shema.Model.Node;
import com.Backend.Shema.Model.Workflow;
import com.Backend.Shema.Services.WorkflowService;

@RestController
@CrossOrigin
@RequestMapping("/workflow")

public class WorkflowController {
	
	@Autowired
	private WorkflowService ws;
	
	@PostMapping("/ajouter")
	public Workflow add(@RequestBody Workflow workf)
	{
		return ws.add(workf);
	}
	@PostMapping("/addId/{id}/{nodeList}/{linkList}")
	public Workflow add(@PathVariable(name="id") String id,@PathVariable(name="nodeList")List<Node> nodeList,@PathVariable(name="linkList")List<Link> linkList)
	{
		return ws.addId(id,nodeList,linkList);
	}
	@DeleteMapping("/delete")
	public void Delete()
	{
		ws.deleteAll();
	}

	@GetMapping("/all")
	public List<Workflow> FindAll() 
	{
		return ws.FindAll();
	}
	@GetMapping("/findByTitre/{titre}") 
	public   Workflow FindByTitre(@PathVariable(name="titre") String titre) 
	{
		return ws.FindByTitre(titre);
	}	
	@GetMapping("/findwf/{id}") 
	public Workflow Findwf(@PathVariable(name="id") String id) 
	{
		return ws.Findwf(id);
	}	
	@GetMapping("/findByTitree/{titre}") 
	public   List<Workflow> FindByTitree(@PathVariable(name="titre") String titre) 
	{
		return ws.FindByTitree(titre);
	}	
	@PutMapping("update/{id}")
    public ResponseEntity<Workflow> update(@PathVariable("id") String id, @RequestBody Workflow wf) {
		Workflow updated = ws.update(wf);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

