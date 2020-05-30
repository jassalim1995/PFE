package com.Backend.Test.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Test.Model.Conversation;
import com.Backend.Test.Model.Entreprise;
import com.Backend.Test.Repositories.ConversationRepository;

@Service
public class ConversationService {

	@Autowired
	private ConversationRepository ConversationRepository;
	
	public Conversation add(Conversation conversation) {
		return ConversationRepository.save(conversation);
	}
	
	public void deleteAll() {
		ConversationRepository.deleteAll();
	}
	
	public List<Conversation> FindAll()
	{
		return ConversationRepository.findAll();
	}
}
