package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "client")
public class Client {
	@Id
	private String id;
	private String activite;
	private String client;
	private String contact;
	private String titre;
	private String fonction;
	private String secteur;
	private String telephone;
	private String email;
	private String adresse;
	private String cp;
	private String ville;
	private List<Note>NoteList=new ArrayList<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getActivite() {
		return activite;
	}
	public Client(String id, String activite, String client, String contact, String titre, String fonction,
			String secteur, String telephone, String email, String adresse, String cp, String ville,
			List<Note> noteList) {
		super();
		this.id = id;
		this.activite = activite;
		this.client = client;
		this.contact = contact;
		this.titre = titre;
		this.fonction = fonction;
		this.secteur = secteur;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		NoteList = noteList;
	}
	public List<Note> getNoteList() {
		return NoteList;
	}
	public void setNoteList(List<Note> noteList) {
		NoteList = noteList;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Client(String id, String activite, String client, String contact, String titre, String fonction,
			String secteur, String telephone, String email, String adresse, String cp, String ville) {
		super();
		this.id = id;
		this.activite = activite;
		this.client = client;
		this.contact = contact;
		this.titre = titre;
		this.fonction = fonction;
		this.secteur = secteur;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
}
