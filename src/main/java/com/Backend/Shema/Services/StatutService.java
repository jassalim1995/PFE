package com.Backend.Shema.Services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.refStatut;
import com.Backend.Shema.Repositories.StatutRepository;






@Service
public class StatutService {

	@Autowired
	private StatutRepository mr;
	
	public refStatut addrefStatut (refStatut user) {
	
		return mr.save(user);
	}

	public refStatut uprefStatut (refStatut user) {
	
		return mr.save(user);
	}
	public List<refStatut> FindAllrefStatuts()
	{
		return mr.findAll();
	}
 
	
	

}
