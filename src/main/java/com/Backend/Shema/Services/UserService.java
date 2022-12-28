package com.Backend.Shema.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.Link;
import com.Backend.Shema.Model.Node;
import com.Backend.Shema.Model.User;
import com.Backend.Shema.Repositories.UserRepository;




@Service
public class UserService {

	@Autowired
	private UserRepository us;
	
	public User addUser(User user) {
		return us.save(user);
	}

	public List<User> FindAllUsers()
	{
		return us.findAll();
	}
 
	public Optional<User> FindUserById(String id){
    	return us.findById(id);
    			
    }
	public User findUserByMail(String email) {
		return us.findUserByEmail(email);
	}
	public List<User> FindByTitree(String email) {
		return us.findByEmail(email);
	}
}
