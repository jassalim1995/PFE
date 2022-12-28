package com.Backend.Shema.Services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.Link;
import com.Backend.Shema.Model.Node;
import com.Backend.Shema.Model.Conversation;
import com.Backend.Shema.Repositories.ConversationRepository;




@Service
public class ConversationService {

	@Autowired
	private ConversationRepository ns;
	
	public Conversation addConversation(Conversation user) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:");  
        String strDate = dateFormat.format(date);  
        user.setDate(strDate);
		return ns.save(user);
	}

	public List<Conversation> FindAllConversations()
	{
		return ns.findAll();
	}
 
	public Optional<Conversation> FindConversationById(String id){
    	return ns.findById(id);
    			
    }
	
	public List<Conversation> FindByTitree(String projet) {
		return ns.findByProjet(projet);
	}
}
