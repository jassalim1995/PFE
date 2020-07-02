package com.Backend.Test.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.*;

@Document(collection = "Clients")
public class Clients {
	private String nom;
	private String secteur;
	private String activite;
	private String adresse;
	private String ville;
	private String codePostal ;
	private String telephone1 ;
	private String telephone2;
	private String email;
	private String linkedIn;
	private String notes;
	private String precisions;
	private Date dateMiseAJour;
	private String statut;
	private String trigramme;
	private Contact contacts;
	
	public Clients() {
		super();
		//this.Contacts = new ArrayList<>();
	}

	public Clients(String nom, String secteur, String activite, String adresse, String ville, String codePostal,
			String telephone1, String telephone2, String email, String linkedIn, String notes, String precisions,
			Date dateMiseAJour, String statut, String trigramme, Contact contacts) {
		super();
		this.nom = nom;
		this.secteur = secteur;
		this.activite = activite;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.telephone1 = telephone1;
		this.telephone2 = telephone2;
		this.email = email;
		this.linkedIn = linkedIn;
		this.notes = notes;
		this.precisions = precisions;
		this.dateMiseAJour = dateMiseAJour;
		this.statut = statut;
		this.trigramme = trigramme;
		this.contacts = contacts;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPrecisions() {
		return precisions;
	}

	public void setPrecisions(String precisions) {
		this.precisions = precisions;
	}

	public Date getDateMiseAJour() {
		return dateMiseAJour;
	}

	public void setDateMiseAJour(Date dateMiseAJour) {
		this.dateMiseAJour = dateMiseAJour;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getTrigramme() {
		return trigramme;
	}

	public void setTrigramme(String trigramme) {
		this.trigramme = trigramme;
	}

	public Contact getContacts() {
		return contacts;
	}

	public void setContacts(Contact contacts) {
		this.contacts = contacts;
	}
	
	
	
}
