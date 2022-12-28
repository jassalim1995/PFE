package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.SuiviDoc;
import com.Backend.Shema.Model.Specification_planification;
import com.Backend.Shema.Repositories.SuiviDocRepository;






@Service
public class SuiviDocService {

	@Autowired
	private SuiviDocRepository sdr;
	
	public SuiviDoc addSuiviDoc (SuiviDoc user) {
	
		return sdr.save(user);
	}

	public SuiviDoc upSuiviDoc (SuiviDoc user) {
	
		return sdr.save(user);
	}
	public List<SuiviDoc> FindAllSuiviDocs()
	{
		return sdr.findAll();
	}
 
	public Optional<SuiviDoc> FindSuiviDocById(String id){
    	return sdr.findById(id);
    			
    }
	
}
