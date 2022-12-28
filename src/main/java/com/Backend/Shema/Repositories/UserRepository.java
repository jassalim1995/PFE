package com.Backend.Shema.Repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.Backend.Shema.Model.User;




@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	@Query("{'email' : ?0 }")
	User findUserByEmail(String email);
	List<User>findByEmail(String email);

}	