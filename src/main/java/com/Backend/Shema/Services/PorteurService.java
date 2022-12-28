package com.Backend.Shema.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.refPorteur;
import com.Backend.Shema.Repositories.PorteurRepository;


@Service
public class PorteurService {

	@Autowired
	private PorteurRepository mr;
	
	public refPorteur addrefPorteur (refPorteur user) {
	
		return mr.save(user);
	}

	public refPorteur uprefPorteur (refPorteur user) {
	
		return mr.save(user);
	}
	public List<refPorteur> FindAllrefPorteurs()
	{
		return mr.findAll();
	}
 
	
	

}
