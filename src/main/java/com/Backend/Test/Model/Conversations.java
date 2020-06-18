package com.Backend.Test.Model;

import java.util.Date;

public class Conversations {

	  private String texte;
	  private Date date;
      private String trigramme;
      
      
	public Conversations() {
		super();
	}


	public Conversations(String texte, Date date, String trigramme) {
		super();
		this.texte = texte;
		this.date = date;
		this.trigramme = trigramme;
	}


	public String getTexte() {
		return texte;
	}


	public void setTexte(String texte) {
		this.texte = texte;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getTrigramme() {
		return trigramme;
	}


	public void setTrigramme(String trigramme) {
		this.trigramme = trigramme;
	}
      
	
      
}
