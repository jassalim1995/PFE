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
import com.Backend.Shema.Model.Projets;
import com.Backend.Shema.Model.Projets;
import com.Backend.Shema.Repositories.ProjetsRepository;
import com.Backend.Shema.Repositories.ProjetsRepository;





@Service
public class ProjectService {
	private final Path root = Paths.get("uploads");
	@Autowired
	private ProjetsRepository spr;
	
	public Projets addProjets (Projets user) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");  
        String strDate = dateFormat.format(date);  
        user.setCreation(strDate);
		return spr.save(user);
	}
	public Projets upProjets(Projets user) {
		return spr.save(user);
	}

	public List<Projets> FindAllUsers()
	{
		return spr.findAll();
	}
 
	public Optional<Projets> FindPById(String id){
    	return spr.findById(id);
    			
    }
	public List<Projets> Findclient(String client){
    	return spr.findByClientStartingWith(client);
    			
    }
	public List<Projets> Findcontactt(String client){
    	return spr.findByContactStartingWith(client);
    			
    }	public List<Projets> Findactivite(String client){
    	return spr.findByActiviteStartingWith(client);
    			
    }	public List<Projets> FindProjet(String client){
    	return spr.findByProjetStartingWith(client);
    			
    }
    public List<Projets> Findecheance(String client){
    	return spr.findByEcheanceStartingWith(client);
    			
    }
	 
	  }


