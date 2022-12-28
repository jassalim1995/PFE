package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.refEtape;
import com.Backend.Shema.Repositories.EtapeRepository;






@Service
public class EtapeService {

	@Autowired
	private EtapeRepository mr;
	
	public refEtape addrefEtape (refEtape user) {
	
		return mr.save(user);
	}

	public refEtape uprefEtape (refEtape user) {
	
		return mr.save(user);
	}
	public List<refEtape> FindAllrefEtapes()
	{
		return mr.findAll();
	}
 
	
	

}
