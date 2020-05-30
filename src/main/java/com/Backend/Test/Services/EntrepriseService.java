package com.Backend.Test.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Test.Model.Entreprise;
import com.Backend.Test.Repositories.EntrepriseRepository;

@Service
public class EntrepriseService {
	
	@Autowired
	private EntrepriseRepository EntrepriseRepository;
		
	public Entreprise add(Entreprise entreprise) {
		return EntrepriseRepository.save(entreprise);
	}
	
	public void deleteAll() {
		EntrepriseRepository.deleteAll();
	}
	
	public List<Entreprise> FindAll()
	{
		return EntrepriseRepository.findAll();
	}
}
