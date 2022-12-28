package com.Backend.Shema.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Shema.Model.Link;
import com.Backend.Shema.Model.Node;
import com.Backend.Shema.Model.Workflow;
import com.Backend.Shema.Repositories.WorkflowRepository;



@Service
public class WorkflowService {

	@Autowired
	private WorkflowRepository Wf;
	
	public Workflow add(Workflow wf) {
		return Wf.save(wf);
	}
	 public Workflow update(Workflow wf) {
	        if (wf.getId() == null) {
	            return null;
	        }
	        if (Wf.existsById(wf.getId())) {
	            
	            return Wf.save(wf);
	        }
	        return null;

	    }
	public Workflow addId(String id,List<Node> nodeList,List<Link> linkList) {
		Workflow wf=new Workflow();
		wf.setId(id);
		wf.setLinkList(linkList);
		wf.setNodeList(nodeList);
		return Wf.save(wf);
	}
	public void deleteAll() {
		Wf.deleteAll();
	}
	
	public List<Workflow> FindAll()
	{
		return Wf.findAll();
	}
 
	public Workflow Findwf(String id){
    	return Wf.findOne(id);
    			
    }
	public Workflow FindByTitre(String titre) {
		return Wf.findWorkflowByTitre(titre);
	}
	public List<Workflow> FindByTitree(String titre) {
		return Wf.findByTitre(titre);
	}
}
