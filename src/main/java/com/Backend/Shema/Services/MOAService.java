package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.refMOA;
import com.Backend.Shema.Repositories.MOARepository;






@Service
public class MOAService {

	@Autowired
	private MOARepository mr;
	
	public refMOA addrefMOA (refMOA user) {
	
		return mr.save(user);
	}

	public refMOA uprefMOA (refMOA user) {
	
		return mr.save(user);
	}
	public List<refMOA> FindAllrefMOAs()
	{
		return mr.findAll();
	}
 
	
	

}
