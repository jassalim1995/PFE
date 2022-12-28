package com.Backend.Shema.Controllers;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.Backend.Shema.Model.Dev_planification;
import com.Backend.Shema.Model.Realisation_deploiment;
import com.Backend.Shema.Model.Spec_deploiment;
import com.Backend.Shema.Services.Dev_planificationService;
import com.Backend.Shema.Services.Realisation_deploimentService;
import com.Backend.Shema.Services.Realisation_deploimentService;
import com.Backend.Shema.Services.Spec_deploimentService;
import com.Backend.Shema.Services.Spec_deploimentService;



import org.springframework.http.MediaType;


@RestController
@CrossOrigin
@RequestMapping("/deploiment")

public class DeploimentController {
	
	@Autowired
	private Spec_deploimentService sds;
	@Autowired
	private Realisation_deploimentService rds;
	
	
	@PostMapping("/ajoutersd")
	public Spec_deploiment addsd(@RequestBody Spec_deploiment user)
	{
		return sds.addSpec_deploiment(user);
	}
	
	@GetMapping("/allsd")
	public List<Spec_deploiment> FindAllsp() 
	{
		return sds.FindAllUsers();
	}

	@GetMapping("/findSdById/{id}") 
	public Optional<Spec_deploiment> Findsp(@PathVariable(name="id") String id) 
	{
		return sds.FindSpById(id);
	}	
	
	@PutMapping("updateSd/{id}")
    public ResponseEntity<Spec_deploiment> updatesp(@PathVariable("id") String id, @RequestBody Spec_deploiment user) {
    	Spec_deploiment updated = sds.upSpec_deploiment(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }
	@PostMapping("/ajoutermp")
	public Realisation_deploiment addmp(@RequestBody Realisation_deploiment user)
	{
		return rds.addRealisation_deploiment(user);
	}
	
	@GetMapping("/allmp")
	public List<Realisation_deploiment> FindAllmp() 
	{
		return rds.FindAllRealisation_deploiments();
	}

	@GetMapping("/findMpById/{id}") 
	public Optional<Realisation_deploiment> Findmp(@PathVariable(name="id") String id) 
	{
		return rds.FindRealisation_deploimentById(id);
	}	
	
	@PutMapping("updateMp/{id}")
    public ResponseEntity<Realisation_deploiment> updatemp(@PathVariable("id") String id, @RequestBody Realisation_deploiment user) {
		Realisation_deploiment updated = rds.upRealisation_deploiment(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }


	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

