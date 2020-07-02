package com.Backend.Test.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "Personne")
public class Personne {
	
	private String nom;
	private List<Technologie> technologies;
	private List<Tagtechn> tag;
	private List<ActionPers> action;
	
	
	public Personne() {
		super();
	}
	
	public Personne(String nom, List<Technologie> technologies, List<Tagtechn> tag, List<ActionPers> action) {
		super();
		this.nom = nom;
		this.technologies = technologies;
		this.tag = tag;
		this.action = action;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Technologie> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<Technologie> technologies) {
		this.technologies = technologies;
	}
	public List<Tagtechn> getTag() {
		return tag;
	}
	public void setTag(List<Tagtechn> tag) {
		this.tag = tag;
	}
	public List<ActionPers> getAction() {
		return action;
	}
	public void setAction(List<ActionPers> action) {
		this.action = action;
	}
	
	

}
