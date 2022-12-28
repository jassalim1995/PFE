package com.Backend.Shema.Services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Shema.Model.Dev_planification;
import com.Backend.Shema.Model.MEP_planification;
import com.Backend.Shema.Repositories.MEP_planificationRepository;


@Service
public class MEP_planificationService {

	@Autowired
	private MEP_planificationRepository mpr;
	
	public MEP_planification upMEP_planification (MEP_planification user) {
		return mpr.save(user);
	}
	public MEP_planification addMEP_planification (MEP_planification user) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
        String strDate = dateFormat.format(date);  
        user.setDsaisie(strDate);
		return mpr.save(user);
	}
	public List<MEP_planification> FindAllMEP_planifications()
	{
		return mpr.findAll();
	}
 
	public Optional<MEP_planification> FindMEP_planificationById(String id){
    	return mpr.findById(id);
    			
    }
	

}
