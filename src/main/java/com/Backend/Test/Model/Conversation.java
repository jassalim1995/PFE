package com.Backend.Test.Model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "conversation")
public class Conversation {
	
	 public enum Qualites  {TresBien, Bien, Moyenne, Mauvaise} ;
	
	@Transient
	public static final String SEQUENCE_NAME = "conversation_sequence";
	
	@Id
	private long id;
	private Date date;
	private Qualites qualite;
	private String Conversation;
	private String reponse;
	
	public Conversation() {
		super();
	}

	public Conversation(long id, Date date, Qualites qualite, String Conversation, String Reponse) {
		super();
		this.id = id;
		this.date = date;
		this.qualite = qualite;
		this.Conversation = Conversation;
		this.reponse = Reponse;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Qualites getQualite() {
		return qualite;
	}

	public void setQualite(Qualites qualite) {
		this.qualite = qualite;
	}

	public String getConversation() {
		return Conversation;
	}

	public void setConversation(String Conversation) {
		this.Conversation = Conversation;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String Reponse) {
		this.reponse = Reponse;
	}

	@Override
	public String toString() {
		return "Conversation [id=" + id + ", date=" + date + ", qualite=" + qualite + ", Conversation=" + Conversation
				+ ", Reponse=" + reponse + "]";
	}
	
	

}
