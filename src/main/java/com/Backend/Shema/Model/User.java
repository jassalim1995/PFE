package com.Backend.Shema.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "User")
public class User {
	@Id
	private String Id;
	private String workflow;
	private String email;
	private String passwd;
	private String type;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public User(String id, String email, String passwd, String type) {
		super();
		Id = id;
		this.email = email;
		this.passwd = passwd;
		this.type = type;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getWorkflow() {
		return workflow;
	}
	public void setWorkflow(String workflow) {
		this.workflow = workflow;
	}
	public User(String id, String workflow, String email, String passwd, String type) {
		super();
		Id = id;
		this.workflow = workflow;
		this.email = email;
		this.passwd = passwd;
		this.type = type;
	}

	
	


	
	

}
