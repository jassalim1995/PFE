package com.Backend.Test.Model;

import java.util.*;

public class Contact {
	private String statut;
	private String nom;
	private String prenom;
	private String titre;
	private String telephone1;
	private String telephone2;
	private String mobile;
	private String email;
	private String observation;
	private String outils;
	private String linkedIn;
	private List<Rappel> rappels;
	private List<Push> push;
	private String plaquetteLibelle;
	private Date plaquetteDate;
	private List<Conversations> conversations;
	private Besoins besoins;
	private Date dateMiseAJour;
	private String trigramme;

	public Contact() {
		super();
		this.rappels = new ArrayList<>();
		this.conversations = new ArrayList<>();
		this.push = new ArrayList<>();
	}

	public Contact(String statut, String nom, String prenom, String titre, String telephone1, String telephone2,
			String mobile, String email, String observation, String outils, String linkedIn, List<Rappel> rappels,
			List<Push> push, String plaquetteLibelle, Date plaquetteDate, List<Conversations> conversations,
			Besoins besoins, Date dateMiseAJour, String trigramme) {
		super();
		this.statut = statut;
		this.nom = nom;
		this.prenom = prenom;
		this.titre = titre;
		this.telephone1 = telephone1;
		this.telephone2 = telephone2;
		this.mobile = mobile;
		this.email = email;
		this.observation = observation;
		this.outils = outils;
		this.linkedIn = linkedIn;
		this.rappels = rappels;
		this.push = push;
		this.plaquetteLibelle = plaquetteLibelle;
		this.plaquetteDate = plaquetteDate;
		this.conversations = conversations;
		this.besoins = besoins;
		this.dateMiseAJour = dateMiseAJour;
		this.trigramme = trigramme;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
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

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getOutils() {
		return outils;
	}

	public void setOutils(String outils) {
		this.outils = outils;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public List<Rappel> getRappels() {
		return rappels;
	}

	public void setRappels(List<Rappel> rappels) {
		this.rappels = rappels;
	}

	public List<Push> getPush() {
		return push;
	}

	public void setPush(List<Push> push) {
		this.push = push;
	}

	public String getPlaquetteLibelle() {
		return plaquetteLibelle;
	}

	public void setPlaquetteLibelle(String plaquetteLibelle) {
		this.plaquetteLibelle = plaquetteLibelle;
	}

	public Date getPlaquetteDate() {
		return plaquetteDate;
	}

	public void setPlaquetteDate(Date plaquetteDate) {
		this.plaquetteDate = plaquetteDate;
	}

	public List<Conversations> getConversations() {
		return conversations;
	}

	public void setConversations(List<Conversations> conversations) {
		this.conversations = conversations;
	}

	public Besoins getBesoins() {
		return besoins;
	}

	public void setBesoins(Besoins besoins) {
		this.besoins = besoins;
	}

	public Date getDateMiseAJour() {
		return dateMiseAJour;
	}

	public void setDateMiseAJour(Date dateMiseAJour) {
		this.dateMiseAJour = dateMiseAJour;
	}

	public String getTrigramme() {
		return trigramme;
	}

	public void setTrigramme(String trigramme) {
		this.trigramme = trigramme;
	}

}
