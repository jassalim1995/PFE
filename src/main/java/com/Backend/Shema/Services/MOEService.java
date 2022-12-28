package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.refMOE;
import com.Backend.Shema.Repositories.MOERepository;






@Service
public class MOEService {

	@Autowired
	private MOERepository mr;
	
	public refMOE addrefMOE (refMOE user) {
	
		return mr.save(user);
	}

	public refMOE uprefMOE (refMOE user) {
	
		return mr.save(user);
	}
	public List<refMOE> FindAllrefMOEs()
	{
		return mr.findAll();
	}
 
	
	

}
