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


import com.Backend.Shema.Model.Spec_deploiment;

import com.Backend.Shema.Repositories.Spec_deploimentRepository;





@Service
public class Spec_deploimentService {
	private final Path root = Paths.get("uploads");
	@Autowired
	private Spec_deploimentRepository spr;
	
	public Spec_deploiment addSpec_deploiment (Spec_deploiment user) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
        String strDate = dateFormat.format(date);  
        user.setDsaisie(strDate);
		return spr.save(user);
	}
	public Spec_deploiment upSpec_deploiment(Spec_deploiment user) {
		return spr.save(user);
	}

	public List<Spec_deploiment> FindAllUsers()
	{
		return spr.findAll();
	}
 
	public Optional<Spec_deploiment> FindSpById(String id){
    	return spr.findById(id);
    			
    }

	  public void saveup(MultipartFile file) {
	    try {
	      Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
	    } catch (Exception e) {
	      throw new RuntimeException("Could not store the file. Error: " + e.getMessage());
	    }
	  }

}
