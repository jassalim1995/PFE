package com.Backend.Shema.Repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Backend.Shema.Model.Conversation;
import com.Backend.Shema.Model.Note;
import com.Backend.Shema.Model.User;




@Repository
public interface NoteRepository extends MongoRepository<Note, String> {

	List<Note>findByProjet(String projet);

}	