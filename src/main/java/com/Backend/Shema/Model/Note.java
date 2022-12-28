package com.Backend.Shema.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "note")
public class Note {
	@Id
	private String id;
	private String date;
	private String note;
	private String droit;
	private String projet;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getDroit() {
		return droit;
	}
	public void setDroit(String droit) {
		this.droit = droit;
	}
	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	public Note(String id, String date, String note, String droit, String projet) {
		super();
		this.id = id;
		this.date = date;
		this.note = note;
		this.droit = droit;
		this.projet = projet;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

	
}
