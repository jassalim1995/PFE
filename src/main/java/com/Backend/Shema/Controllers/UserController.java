package com.Backend.Shema.Controllers;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.Shema.Model.Mail;
import com.Backend.Shema.Model.User;
import com.Backend.Shema.Services.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	private Mail emailHelper;
	@Autowired
	private UserService us;
	
	@PostMapping("/ajouter")
	public User add(@RequestBody User user)
	{
		return us.addUser(user);
	}
	
	@GetMapping("/all")
	public List<User> FindAll() 
	{
		return us.FindAllUsers();
	}
	@GetMapping("/findByEmail/{email}") 
	public   User FindByTitre(@PathVariable(name="email") String email) 
	{
		return us.findUserByMail(email);
	}	
	@GetMapping("/findById/{id}") 
	public Optional<User> Findwf(@PathVariable(name="id") String id) 
	{
		return us.FindUserById(id);
	}	
	
	@PutMapping("update/{id}")
    public ResponseEntity<User> update(@PathVariable("id") String id, @RequestBody User user) {
		User updated = us.addUser(user);
        if (updated != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(updated);
        }
        return ResponseEntity.noContent().build();
    }

	@RequestMapping(value ="/sendemail/{mail}/{mdp}")
	public String sendEmail(@PathVariable("mdp") String mdp,@PathVariable("mail") String mail)
	{
		emailHelper.sendEmail(mail,mdp);
		return "Email sent successfully";
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

