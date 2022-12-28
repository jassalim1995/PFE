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
import com.Backend.Shema.Model.Note;
import com.Backend.Shema.Repositories.NoteRepository;




@Service
public class NoteService {

	@Autowired
	private NoteRepository ns;
	
	public Note addNote(Note user) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
        String strDate = dateFormat.format(date);  
        user.setDate(strDate);
		return ns.save(user);
	}

	public List<Note> FindAllNotes()
	{
		return ns.findAll();
	}
 
	public Optional<Note> FindNoteById(String id){
    	return ns.findById(id);
    			
    }
	
	public List<Note> FindByTitree(String projet) {
		return ns.findByProjet(projet);
	}
}
