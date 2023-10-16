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
import com.Backend.Shema.Model.MEP_planification;
import com.Backend.Shema.Model.Projets;
import com.Backend.Shema.Model.Specification_planification;
import com.Backend.Shema.Services.Dev_planificationService;
import com.Backend.Shema.Services.MEP_planificationService;
import com.Backend.Shema.Services.ProjectService;
import com.Backend.Shema.Services.Specification_planificationService;



import org.springframework.http.MediaType;


@RestController
@CrossOrigin
@RequestMapping("/plan")

public class PlanificationController {
	
	@Autowired
	private ProjectService ps;
	@Autowired
	private MEP_planificationService mps;
	@Autowired
	private Dev_planificationService dps;
	@Autowired
	private Specification_planificationService sps;
	
	@PostMapping("/ajoutersp")
	public Specification_planification addmp(@RequestBody Specification_planification user)
	{
		return sps.addSpecification_planification(user);
	}
	
	@GetMapping("/allsp")
	public List<Specification_planification> FindAllsp() 
	{
		return sps.FindAllUsers();
	}
	@GetMapping("/findbyclient/{id}") 
	public List<Specification_planification> Findbyclient(@PathVariable(name="id") String id) 
	{
		return sps.Findclient(id);
	}
	@GetMapping("/findbyprojet/{id}") 
	public List<Specification_planification> Findbyprojet(@PathVariable(name="id") String id) 
	{
		return sps.FindProjet(id);
	}
	@GetMapping("/findbycontact/{id}") 
	public List<Specification_planification> Findbycontact(@PathVariable(name="id") String id) 
	{
		return sps.Findcontactt(id);
	}
	@GetMapping("/findbyactivite/{id}") 
	public List<Specification_planification> Findbyactivite(@PathVariable(name="id") String id) 
	{
		return sps.Findactivite(id);
	}
	@GetMapping("/findSpById/{id}") 
	public Optional<Specification_planification> Findsp(@PathVariable(name="id") String id) 
	{
		return sps.FindSpById(id);
	}	
	
	@PutMapping("updateSp/{id}")
    public ResponseEntity<Specification_planification> updatesp(@PathVariable("id") String id, @RequestBody Specification_planification user) {
    	Specification_planification updated = sps.upSpecification_planification(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }
	@PostMapping("/ajoutermp")
	public MEP_planification addmp(@RequestBody MEP_planification user)
	{
		return mps.addMEP_planification(user);
	}
	
	@GetMapping("/allmp")
	public List<MEP_planification> FindAllmp() 
	{
		return mps.FindAllMEP_planifications();
	}

	@GetMapping("/findMpById/{id}") 
	public Optional<MEP_planification> Findmp(@PathVariable(name="id") String id) 
	{
		return mps.FindMEP_planificationById(id);
	}	
	
	@PutMapping("updateMp/{id}")
    public ResponseEntity<MEP_planification> updatemp(@PathVariable("id") String id, @RequestBody MEP_planification user) {
		MEP_planification updated = mps.upMEP_planification(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }
	@PostMapping("/ajouterp")
	public Projets addmp(@RequestBody Projets user)
	{
		return ps.addProjets(user);
	}
	
	@GetMapping("/allp")
	public List<Projets> FindAllp() 
	{
		return ps.FindAllUsers();
	}
	@GetMapping("/findPbyclient/{id}") 
	public List<Projets> FindPbyclient(@PathVariable(name="id") String id) 
	{
		return ps.Findclient(id);
	}
	@GetMapping("/findPbyprojet/{id}") 
	public List<Projets> FindPbyprojet(@PathVariable(name="id") String id) 
	{
		return ps.FindProjet(id);
	}
	@GetMapping("/findPbycontact/{id}") 
	public List<Projets> FindPbycontact(@PathVariable(name="id") String id) 
	{
		return ps.Findcontactt(id);
	}
	@GetMapping("/findPbyactivite/{id}") 
	public List<Projets> FindPbyactivite(@PathVariable(name="id") String id) 
	{
		return ps.Findactivite(id);
	}
	@GetMapping("/findPbyecheance/{id}") 
	public List<Projets> FindPbyecheance(@PathVariable(name="id") String id) 
	{
		return ps.Findecheance(id);
	}
	@GetMapping("/findPById/{id}") 
	public Optional<Projets> Findp(@PathVariable(name="id") String id) 
	{
		return ps.FindPById(id);
	}	
	
	@PutMapping("updatep/{id}")
    public ResponseEntity<Projets> updatesp(@PathVariable("id") String id, @RequestBody Projets user) {
		Projets updated = ps.upProjets(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }

	@PostMapping("/ajouterdp")
	public Dev_planification adddp(@RequestBody Dev_planification user)
	{
		return dps.addDev_planification(user);
	}
	
	@GetMapping("/alldp")
	public List<Dev_planification> FindAlldp() 
	{
		return dps.FindAllDev_planifications();
	}

	@GetMapping("/findDpById/{id}") 
	public Optional<Dev_planification> Finddp(@PathVariable(name="id") String id) 
	{
		return dps.FindDev_planificationById(id);
	}	
	
	@PutMapping("updateDp/{id}")
    public ResponseEntity<Dev_planification> updatedp(@PathVariable("id") String id, @RequestBody Dev_planification user) {
		Dev_planification updated = dps.upDev_planification(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/download")
	public void downloadFile(String fileName, HttpServletResponse res) throws Exception {
		res.setHeader("Content-Disposition", "attachment; filename=" + fileName);
		res.getOutputStream().write(contentOf(fileName));
	}
	
	private byte[] contentOf(String fileName) throws Exception {
	
		return Files.readAllBytes( Paths.get(getClass().getClassLoader().getResource(fileName).toURI()));
	}
	 public static String uploadDirectory ="C:/Users/Salim/Desktop/back/src/main/resources/";
	
	
		@PostMapping("/upload")
		public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
			File convertFile = new File(uploadDirectory+file.getOriginalFilename());
			System.out.println("Current working directory in Java : " + uploadDirectory);
			convertFile.createNewFile();
			FileOutputStream fout = new FileOutputStream(convertFile);
			fout.write(file.getBytes());
			fout.close();
			
			return new ResponseEntity<>("File is uploaded successfully", HttpStatus.OK);
		}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

