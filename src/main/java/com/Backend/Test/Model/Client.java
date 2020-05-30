package com.Backend.Test.Model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
public class Client {
	
	@Transient
	public static final String SEQUENCE_NAME = "Client_sequence";
	
	@Id
	private long id;
	
	private String titre;
	private String nom;
	private String prenom;
	private long tel;
	private String email;
	private String observation;
	private String linkedin;
	private Date rappel;
	//private Cv cv;
	
	
	public Client() {
		super();
	}



	public Client(long id, String titre, String nom, String prenom, long tel, String email, String observation,
			String linkedin, Date rappel) {
		super();
		this.id = id;
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.observation = observation;
		this.linkedin = linkedin;
		this.rappel = rappel;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public long getTel() {
		return tel;
	}



	public void setTel(long tel) {
		this.tel = tel;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getObservation() {
		return observation;
	}



	public void setObservation(String observation) {
		this.observation = observation;
	}



	public String getLinkedin() {
		return linkedin;
	}



	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}



	public Date getRappel() {
		return rappel;
	}



	public void setRappel(Date rappel) {
		this.rappel = rappel;
	}


	@Override
	public String toString() {
		return "Client [id=" + id + ", titre=" + titre + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel
				+ ", email=" + email + ", observation=" + observation + ", linkedin=" + linkedin + ", rappel=" + rappel
				+ "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	

	
}
