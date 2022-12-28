package com.Backend.Shema.Services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.Dev_planification;
import com.Backend.Shema.Repositories.Dev_planificationRepository;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;




@Service
public class Dev_planificationService {

	@Autowired
	private Dev_planificationRepository dpr;
	
	public Dev_planification addDev_planification (Dev_planification user) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
        String strDate = dateFormat.format(date);  
        user.setDsaisie(strDate);
		return dpr.save(user);
	}

	public Dev_planification upDev_planification (Dev_planification user) {
	
		return dpr.save(user);
	}
	public List<Dev_planification> FindAllDev_planifications()
	{
		return dpr.findAll();
	}
 
	public Optional<Dev_planification> FindDev_planificationById(String id){
    	return dpr.findById(id);
    			
    }
	

}
