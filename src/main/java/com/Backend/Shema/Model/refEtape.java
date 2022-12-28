package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "refEtape")
public class refEtape {
	@Id
	private String id;
	private String libelle;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public refEtape(String id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public refEtape() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
}
