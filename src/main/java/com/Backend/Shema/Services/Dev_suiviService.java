package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.Dev_suivi;
import com.Backend.Shema.Repositories.Dev_suiviRepository;






@Service
public class Dev_suiviService {

	@Autowired
	private Dev_suiviRepository dsr;
	
	public Dev_suivi addDev_suivi (Dev_suivi user) {
	
		return dsr.save(user);
	}

	public Dev_suivi upDev_suivi (Dev_suivi user) {
	
		return dsr.save(user);
	}
	public List<Dev_suivi> FindAllDev_suivis()
	{
		return dsr.findAll();
	}
 
	public Optional<Dev_suivi> FindDev_suiviById(String id){
    	return dsr.findById(id);
    			
    }
	

}
