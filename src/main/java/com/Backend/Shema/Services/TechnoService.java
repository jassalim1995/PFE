package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.refTechno;
import com.Backend.Shema.Repositories.TechRepository;







@Service
public class TechnoService {

	@Autowired
	private TechRepository mr;
	
	public refTechno addrefTechno (refTechno user) {
	
		return mr.save(user);
	}

	public refTechno uprefTechno (refTechno user) {
	
		return mr.save(user);
	}
	public List<refTechno> FindAllrefTechnos()
	{
		return mr.findAll();
	}
 
	
	

}
