package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "projets")
public class Projets {
	@Id
	private String id;
	private String activite;
	private String client;
	private String projet;
	private String resp;
	private String moa;
	private String moe;
	private String observation;
	private String sponsor;
	private String rappel;
	private String contact;
	private String echeance;
	private String stat;
	private String secteur;
	private String telephone;
	private String email;
	private String etape;
	private String tEquipe;
	private String creation;
	private String debut;
	private String deadline;
	private String techno;
	private String porteur;
	private String dossier;
	
	public Projets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getProjet() {
		return projet;
	}

	public void setProjet(String projet) {
		this.projet = projet;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public String getMoa() {
		return moa;
	}

	public void setMoa(String moa) {
		this.moa = moa;
	}

	public String getMoe() {
		return moe;
	}

	public void setMoe(String moe) {
		this.moe = moe;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public String getRappel() {
		return rappel;
	}

	public void setRappel(String rappel) {
		this.rappel = rappel;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEcheance() {
		return echeance;
	}

	public void setEcheance(String echeance) {
		this.echeance = echeance;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEtape() {
		return etape;
	}

	public void setEtape(String etape) {
		this.etape = etape;
	}

	public String gettEquipe() {
		return tEquipe;
	}

	public void settEquipe(String tEquipe) {
		this.tEquipe = tEquipe;
	}

	public String getCreation() {
		return creation;
	}

	public void setCreation(String creation) {
		this.creation = creation;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getTechno() {
		return techno;
	}

	public void setTechno(String techno) {
		this.techno = techno;
	}

	public String getPorteur() {
		return porteur;
	}

	public void setPorteur(String porteur) {
		this.porteur = porteur;
	}

	public String getDossier() {
		return dossier;
	}

	public void setDossier(String dossier) {
		this.dossier = dossier;
	}

	public Projets(String id, String activite, String client, String projet, String resp, String moa, String moe,
			String observation, String sponsor, String rappel, String contact, String echeance, String stat,
			String secteur, String telephone, String email, String etape, String tEquipe, String creation, String debut,
			String deadline, String techno, String porteur, String dossier) {
		super();
		this.id = id;
		this.activite = activite;
		this.client = client;
		this.projet = projet;
		this.resp = resp;
		this.moa = moa;
		this.moe = moe;
		this.observation = observation;
		this.sponsor = sponsor;
		this.rappel = rappel;
		this.contact = contact;
		this.echeance = echeance;
		this.stat = stat;
		this.secteur = secteur;
		this.telephone = telephone;
		this.email = email;
		this.etape = etape;
		this.tEquipe = tEquipe;
		this.creation = creation;
		this.debut = debut;
		this.deadline = deadline;
		this.techno = techno;
		this.porteur = porteur;
		this.dossier = dossier;
	}


	
}
