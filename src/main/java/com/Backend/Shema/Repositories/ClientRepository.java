package com.Backend.Shema.Repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Backend.Shema.Model.Client;
import com.Backend.Shema.Model.User;




@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
	
	@Query("{'client' : ?0 }")
	Client findClientByClient(String name);
	

}	
