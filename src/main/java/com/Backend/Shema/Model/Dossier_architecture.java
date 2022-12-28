package com.Backend.Shema.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "dossierArchitecture")
public class Dossier_architecture {
	@Id
	private String Id;
	private String disponible;
	private String fichier;
	private String valide;
	private String commentaire;

	
	public Dossier_architecture() {
		super();
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getDisponible() {
		return disponible;
	}


	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}


	public String getFichier() {
		return fichier;
	}


	public void setFichier(String fichier) {
		this.fichier = fichier;
	}


	public String getValide() {
		return valide;
	}


	public void setValide(String valide) {
		this.valide = valide;
	}


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	public Dossier_architecture(String id, String disponible, String fichier, String valide, String commentaire) {
		super();
		Id = id;
		this.disponible = disponible;
		this.fichier = fichier;
		this.valide = valide;
		this.commentaire = commentaire;
	}




}
