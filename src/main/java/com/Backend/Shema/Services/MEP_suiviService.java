package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.MEP_suivi;
import com.Backend.Shema.Repositories.MEP_suiviRepository;






@Service
public class MEP_suiviService {

	@Autowired
	private MEP_suiviRepository msr;
	
	public MEP_suivi addMEP_suivi (MEP_suivi user) {
	
		return msr.save(user);
	}

	public MEP_suivi upMEP_suivi (MEP_suivi user) {
	
		return msr.save(user);
	}
	public List<MEP_suivi> FindAllMEP_suivis()
	{
		return msr.findAll();
	}
 
	public Optional<MEP_suivi> FindMEP_suiviById(String id){
    	return msr.findById(id);
    			
    }
	

}
