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
import com.Backend.Shema.Model.Dev_suivi;
import com.Backend.Shema.Model.MEP_suivi;
import com.Backend.Shema.Model.Note;
import com.Backend.Shema.Model.Projets;
import com.Backend.Shema.Model.Spec_suivi;
import com.Backend.Shema.Model.SuiviDoc;
import com.Backend.Shema.Model.Client;
import com.Backend.Shema.Model.Conversation;

import com.Backend.Shema.Services.ClientService;
import com.Backend.Shema.Services.ConversationService;
import com.Backend.Shema.Services.Dev_suiviService;
import com.Backend.Shema.Services.MEP_suiviService;
import com.Backend.Shema.Services.NoteService;
import com.Backend.Shema.Services.Spec_suiviService;
import com.Backend.Shema.Services.SuiviDocService;

import org.springframework.http.MediaType;


@RestController
@CrossOrigin
@RequestMapping("/suivi")

public class SuiviController {
	
	@Autowired
	private MEP_suiviService mps;
	@Autowired
	private Dev_suiviService dps;
	@Autowired
	private Spec_suiviService sps;
	@Autowired
	private ConversationService cs;
	@Autowired
	private NoteService ns;
	@Autowired
	private ClientService cls;
	@Autowired
	private SuiviDocService sds;
	
	
	@PostMapping("/ajouterss")
	public Spec_suivi addmp(@RequestBody Spec_suivi clser)
	{
		return sps.addSpec_suivi(clser);
	}
	
	@GetMapping("/allss")
	public List<Spec_suivi> FindAllsp() 
	{
		return sps.FindAllSpec_suivis();
	}

	@GetMapping("/findSsById/{id}") 
	public Optional<Spec_suivi> Findsp(@PathVariable(name="id") String id) 
	{
		return sps.FindSpec_suiviById(id);
	}	
	
	@PutMapping("updateSs/{id}")
    public ResponseEntity<Spec_suivi> updatesp(@PathVariable("id") String id, @RequestBody Spec_suivi clser) {
    	Spec_suivi updated = sps.upSpec_suivi(clser);
        if (updated != null) {
        	 return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }
	@PostMapping("/ajouterms")
	public MEP_suivi addmp(@RequestBody MEP_suivi clser)
	{
		return mps.addMEP_suivi(clser);
	}
	
	@GetMapping("/allms")
	public List<MEP_suivi> FindAllmp() 
	{
		return mps.FindAllMEP_suivis();
	}

	@GetMapping("/findMsById/{id}") 
	public Optional<MEP_suivi> Findmp(@PathVariable(name="id") String id) 
	{
		return mps.FindMEP_suiviById(id);
	}	
	
	@PutMapping("updateMs/{id}")
    public ResponseEntity<MEP_suivi> updatemp(@PathVariable("id") String id, @RequestBody MEP_suivi clser) {
		MEP_suivi updated = mps.upMEP_suivi(clser);
        if (updated != null) {
        	 return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }


	@PostMapping("/ajouterds")
	public Dev_suivi adddp(@RequestBody Dev_suivi clser)
	{
		return dps.addDev_suivi(clser);
	}
	
	@GetMapping("/allds")
	public List<Dev_suivi> FindAlldp() 
	{
		return dps.FindAllDev_suivis();
	}

	@GetMapping("/findDsById/{id}") 
	public Optional<Dev_suivi> Finddp(@PathVariable(name="id") String id) 
	{
		return dps.FindDev_suiviById(id);
	}	
	
	@PutMapping("updateDs/{id}")
    public ResponseEntity<Dev_suivi> updatedp(@PathVariable("id") String id, @RequestBody Dev_suivi clser) {
		Dev_suivi updated = dps.upDev_suivi(clser);
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
	 public static String uploadDirectory = System.getProperty("clser.dir")+"/src/main/resources/";
	
	
		@PostMapping("/upload")
		public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
			File convertFile = new File(uploadDirectory+file.getOriginalFilename());
			convertFile.createNewFile();
			FileOutputStream fout = new FileOutputStream(convertFile);
			fout.write(file.getBytes());
			fout.close();
			return new ResponseEntity<>("File is uploaded successfully", HttpStatus.OK);
		}

		@PostMapping("/ajouterConversation")
		public Conversation add(@RequestBody Conversation clser)
		{
			return cs.addConversation(clser);
		}
		
		@GetMapping("/allConversation")
		public List<Conversation> FindAll() 
		{
			return cs.FindAllConversations();
		}
		@GetMapping("/findConversationByProjet/{projet}") 
		public   List<Conversation> FindByTitre(@PathVariable(name="projet") String projet) 
		{
			return cs.FindByTitree(projet);
		}	
			
		
		@PutMapping("updateConver/{id}")
	    public ResponseEntity<Conversation> update(@PathVariable("id") String id, @RequestBody Conversation clser) {
			Conversation updated = cs.addConversation(clser);
	        if (updated != null) {
	        	 return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
	        }
	        return ResponseEntity.noContent().build();
	    }
		@PostMapping("/ajouterNote")
		public Note addnote(@RequestBody Note clser)
		{
			return ns.addNote(clser);
		}
		
		@GetMapping("/allNote")
		public List<Note> FindAllnote() 
		{
			return ns.FindAllNotes();
		}
		@GetMapping("/findNoteByProjet/{projet}") 
		public   List<Note> FindByTitrenote(@PathVariable(name="projet") String projet) 
		{
			return ns.FindByTitree(projet);
		}	
			
		
		@PutMapping("updateNote/{id}")
	    public ResponseEntity<Note> updatenote(@PathVariable("id") String id, @RequestBody Note clser) {
			Note updated = ns.addNote(clser);
	        if (updated != null) {
	        	 return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
	        }
	        return ResponseEntity.noContent().build();
	    }
		@PostMapping("/ajouterCl")
		public Client add(@RequestBody Client clser)
		{
			return cls.addClient(clser);
		}
		
		@GetMapping("/allCl")
		public List<Client> FindAllCl() 
		{
			return cls.FindAllClients();
		}
		@GetMapping("/findClByEmail/{email}") 
		public   Client FindClByTitre(@PathVariable(name="email") String email) 
		{
			return cls.findClientByMail(email);
		}	
		@GetMapping("/findClById/{id}") 
		public Optional<Client> Findwf(@PathVariable(name="id") String id) 
		{
			return cls.FindClientById(id);
		}	
		
		@PutMapping("updatecl/{id}")
	    public ResponseEntity<Client> update(@PathVariable("id") String id, @RequestBody Client clser) {
			Client updated = cls.addClient(clser);
	        if (updated != null) {
	            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
	        }
	        return ResponseEntity.noContent().build();
	    }
		@PostMapping("/ajoutersd")
		public SuiviDoc addmp(@RequestBody SuiviDoc clser)
		{
			return sds.addSuiviDoc(clser);
		}
		
		@GetMapping("/allsd")
		public List<SuiviDoc> FindAllsd() 
		{
			return sds.FindAllSuiviDocs();
		}

		@GetMapping("/findSdById/{id}") 
		public Optional<SuiviDoc> Findsd(@PathVariable(name="id") String id) 
		{
			return sds.FindSuiviDocById(id);
		}	
		
		@PutMapping("updateSd/{id}")
	    public ResponseEntity<SuiviDoc> updatesp(@PathVariable("id") String id, @RequestBody SuiviDoc clser) {
			SuiviDoc updated = sds.upSuiviDoc(clser);
	        if (updated != null) {
	        	 return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
	        }
	        return ResponseEntity.noContent().build();
	    }
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

