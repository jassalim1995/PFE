package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.Spec_suivi;
import com.Backend.Shema.Model.Specification_planification;
import com.Backend.Shema.Repositories.Spec_suiviRepository;






@Service
public class Spec_suiviService {

	@Autowired
	private Spec_suiviRepository ssr;
	
	public Spec_suivi addSpec_suivi (Spec_suivi user) {
	
		return ssr.save(user);
	}

	public Spec_suivi upSpec_suivi (Spec_suivi user) {
	
		return ssr.save(user);
	}
	public List<Spec_suivi> FindAllSpec_suivis()
	{
		return ssr.findAll();
	}
 
	public Optional<Spec_suivi> FindSpec_suiviById(String id){
    	return ssr.findById(id);
    			
    }
	
}
