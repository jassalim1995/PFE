package com.Backend.Shema.Services;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.Realisation_deploiment;
import com.Backend.Shema.Repositories.Realisation_deploimentRepository;


@Service
public class Realisation_deploimentService {

	@Autowired
	private Realisation_deploimentRepository ssr;
	
	public Realisation_deploiment addRealisation_deploiment (Realisation_deploiment user) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
        String strDate = dateFormat.format(date);  
        user.setDsaisie(strDate);
		return ssr.save(user);
	}

	public Realisation_deploiment upRealisation_deploiment (Realisation_deploiment user) {
	
		return ssr.save(user);
	}
	public List<Realisation_deploiment> FindAllRealisation_deploiments()
	{
		return ssr.findAll();
	}
 
	public Optional<Realisation_deploiment> FindRealisation_deploimentById(String id){
    	return ssr.findById(id);
    			
    }
	

}
