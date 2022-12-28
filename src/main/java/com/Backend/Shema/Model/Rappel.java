package com.Backend.Test.Model;
import java.util.Date;
public class Rappel {
	private Date date;
    private String conversation;
    private String trigramme;
    
    
	public Rappel() {
		super();
	}


	public Rappel(Date date, String conversation, String trigramme) {
		super();
		this.date = date;
		this.conversation = conversation;
		this.trigramme = trigramme;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getConversation() {
		return conversation;
	}


	public void setConversation(String conversation) {
		this.conversation = conversation;
	}


	public String getTrigramme() {
		return trigramme;
	}


	public void setTrigramme(String trigramme) {
		this.trigramme = trigramme;
	}
    
	
    
}
