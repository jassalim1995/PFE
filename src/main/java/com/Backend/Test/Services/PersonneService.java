package com.Backend.Test.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Test.Model.Personne;
import com.Backend.Test.Model.Technologie;
import com.Backend.Test.Repositories.PersonneRepositories;

@Service
public class PersonneService {

	
	@Autowired
	private PersonneRepositories PersonneRepositories;
	
	public Personne add(Personne Personne) {
		return PersonneRepositories.save(Personne);
	}
	
	public void deleteAll() {
		PersonneRepositories.deleteAll();
	}
	
	public List<Personne> fin(List<String> techno, List<String> tags, List<String> actions) {
		return PersonneRepositories.findUsersByQuery(techno,tags,actions);
	}
	public Personne FindByName(String name) {
		return PersonneRepositories.findPresonneByName(name);
	}
	public List<Personne> FindAll()
	{
		return PersonneRepositories.findAll();
	}
}
