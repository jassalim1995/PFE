package com.Backend.Shema.Controllers;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.Shema.Model.Mail;
import com.Backend.Shema.Model.refApp;
import com.Backend.Shema.Model.refEtape;
import com.Backend.Shema.Model.refMOA;
import com.Backend.Shema.Model.refMOE;
import com.Backend.Shema.Model.refPorteur;
import com.Backend.Shema.Model.refResp;
import com.Backend.Shema.Model.refStatut;
import com.Backend.Shema.Model.refTechno;
import com.Backend.Shema.Services.AppService;
import com.Backend.Shema.Services.EtapeService;
import com.Backend.Shema.Services.MOAService;
import com.Backend.Shema.Services.MOEService;
import com.Backend.Shema.Services.PorteurService;
import com.Backend.Shema.Services.RespService;
import com.Backend.Shema.Services.StatutService;
import com.Backend.Shema.Services.TechnoService;


@RestController
@CrossOrigin
@RequestMapping("/ref")

public class RefController {
	
	
	@Autowired
	private AppService as;
	@Autowired
	private EtapeService etps;
	@Autowired
	private TechnoService tecs;
	@Autowired
	private PorteurService ps;
	@Autowired
	private RespService rs;
	@Autowired
	private StatutService ss;
	@Autowired
	private MOAService us;
	@Autowired
	private MOEService es;
	@PostMapping("/ajouterMOA")
	public refMOA add(@RequestBody refMOA user)
	{
		return us.addrefMOA(user);
	}
	
	@GetMapping("/allMOA")
	public List<refMOA> FindAll() 
	{
		return us.FindAllrefMOAs();
	}

	@PutMapping("updateMOA/{id}")
    public ResponseEntity<refMOA> update(@PathVariable("id") String id, @RequestBody refMOA user) {
		refMOA updated = us.addrefMOA(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/ajouterMOE")
	public refMOE add(@RequestBody refMOE user)
	{
		return es.addrefMOE(user);
	}
	
	@GetMapping("/allMOE")
	public List<refMOE> FindAllmoe() 
	{
		return es.FindAllrefMOEs();
	}

	@PutMapping("updateMOE/{id}")
    public ResponseEntity<refMOE> updatemoe(@PathVariable("id") String id, @RequestBody refMOE user) {
		refMOE updated = es.addrefMOE(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/ajouterResp")
 	public refResp addresp(@RequestBody refResp user)
 	{
 		return rs.addrefResp(user);
 	}
 	
 	@GetMapping("/allResp")
 	public List<refResp> FindAllresp() 
 	{
 		return rs.FindAllrefResps();
 	}

 	@PutMapping("updateResp/{id}")
     public ResponseEntity<refResp> updateresp(@PathVariable("id") String id, @RequestBody refResp user) {
    	 refResp updated = rs.addrefResp(user);
         if (updated != null) {
             return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
         }
         return ResponseEntity.noContent().build();
     }
     @PostMapping("/ajouterstat")
 	public refStatut add(@RequestBody refStatut user)
 	{
 		return ss.addrefStatut(user);
 	}
 	
 	@GetMapping("/allstat")
 	public List<refStatut> FindAllstatut() 
 	{
 		return ss.FindAllrefStatuts();
 	}

 	@PutMapping("updatestat/{id}")
     public ResponseEntity<refStatut> update(@PathVariable("id") String id, @RequestBody refStatut user) {
    	 refStatut updated = ss.addrefStatut(user);
         if (updated != null) {
             return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
         }
         return ResponseEntity.noContent().build();
     }

     @PostMapping("/ajouterApp")
 	public refApp add(@RequestBody refApp user)
 	{
 		return as.addrefApp(user);
 	}
 	
 	@GetMapping("/allApp")
 	public List<refApp> FindAllApp() 
 	{
 		return as.FindAllrefApps();
 	}
    @PostMapping("/ajouterEtape")
 	public refEtape add(@RequestBody refEtape user)
 	{
 		return etps.addrefEtape(user);
 	}
 	
 	@GetMapping("/allEtape")
 	public List<refEtape> FindAllEtape() 
 	{
 		return etps.FindAllrefEtapes();
 	}
    @PostMapping("/ajouterTechno")
 	public refTechno add(@RequestBody refTechno user)
 	{
 		return tecs.addrefTechno(user);
 	}
 	
 	@GetMapping("/allTechno")
 	public List<refTechno> FindAllTechno() 
 	{
 		return tecs.FindAllrefTechnos();
 	}
    @PostMapping("/ajouterPorteur")
 	public refPorteur add(@RequestBody refPorteur user)
 	{
 		return ps.addrefPorteur(user);
 	}
 	
 	@GetMapping("/allPorteur")
 	public List<refPorteur> FindAllPorteur() 
 	{
 		return ps.FindAllrefPorteurs();
 	}


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

