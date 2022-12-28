package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "conversation")
public class Conversation {
	@Id
	private String id;
	private String date;
	private String conversation;
	private String projet;
	private String droit;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getConversation() {
		return conversation;
	}
	public void setConversation(String conversation) {
		this.conversation = conversation;
	}
	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	public Conversation(String id, String date, String conversation, String projet) {
		super();
		this.id = id;
		this.date = date;
		this.conversation = conversation;
		this.projet = projet;
	}
	public Conversation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDroit() {
		return droit;
	}
	public void setDroit(String droit) {
		this.droit = droit;
	}
	

	
}
