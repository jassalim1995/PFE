package com.Backend.Shema.Services;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Backend.Shema.Model.MEP_planification;
import com.Backend.Shema.Model.Specification_planification;

import com.Backend.Shema.Repositories.Specification_planificationRepository;





@Service
public class Specification_planificationService {
	private final Path root = Paths.get("uploads");
	@Autowired
	private Specification_planificationRepository spr;
	
	public Specification_planification addSpecification_planification (Specification_planification user) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        user.setDsaisie(strDate);
		return spr.save(user);
	}
	public Specification_planification upSpecification_planification(Specification_planification user) {
		return spr.save(user);
	}

	public List<Specification_planification> FindAllUsers()
	{
		return spr.findAll();
	}
 
	public Optional<Specification_planification> FindSpById(String id){
    	return spr.findById(id);
    			
    }
	public List<Specification_planification> Findclient(String client){
    	return spr.findByClientStartingWith(client);
    			
    }
	public List<Specification_planification> Findcontactt(String client){
    	return spr.findByContactStartingWith(client);
    			
    }	public List<Specification_planification> Findactivite(String client){
    	return spr.findByActiviteStartingWith(client);
    			
    }	public List<Specification_planification> FindProjet(String client){
    	return spr.findByProjetStartingWith(client);
    			
    }
	
	  public void saveup(MultipartFile file) {
	    try {
	      Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
	    } catch (Exception e) {
	      throw new RuntimeException("Could not store the file. Error: " + e.getMessage());
	    }
	  }

}
