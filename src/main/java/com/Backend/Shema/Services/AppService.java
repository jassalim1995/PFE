package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.refApp;
import com.Backend.Shema.Repositories.AppRepository;






@Service
public class AppService {

	@Autowired
	private AppRepository mr;
	
	public refApp addrefApp (refApp user) {
	
		return mr.save(user);
	}

	public refApp uprefApp (refApp user) {
	
		return mr.save(user);
	}
	public List<refApp> FindAllrefApps()
	{
		return mr.findAll();
	}
 
	
	

}
