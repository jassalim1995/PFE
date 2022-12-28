package com.Backend.Test.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.Test.Model.Conversation;
import com.Backend.Test.Model.Entreprise;
import com.Backend.Test.Services.ConversationService;
import com.Backend.Test.Services.EntrepriseService;
import com.Backend.Test.Services.SequenceGenerator;

@RestController
@CrossOrigin
@RequestMapping("/conversation")
public class ConversationController {
	
	@Autowired
	private ConversationService ConversationService;
	
	@Autowired
	private SequenceGenerator sequenceGenerator;
	
	@PostMapping("/add")
	public Conversation add(@RequestBody Conversation conversation)
	{
		conversation.setId(sequenceGenerator.generateSequence(Conversation.SEQUENCE_NAME));
		return ConversationService.add(conversation);
	}
	
	@DeleteMapping("delete")
	public void Delete()
	{
		ConversationService.deleteAll();
	}
	
	@GetMapping("/all")
	public List<Conversation> FindAll() 
	{
		return ConversationService.FindAll();
	}

}
