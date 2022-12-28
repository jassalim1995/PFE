package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "planification")
public class Specification_planification {
	@Id
	private String id;
	private String activite;
	private String client;
	private String projet;
	private String resp;
	private String moa;
	private String moe;
	private String commentaire;
	private String sponsor;
	private String dsaisie;
	private String contact;
	private String echeance;
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
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getDsaisie() {
		return dsaisie;
	}
	public void setDsaisie(String dsaisie) {
		this.dsaisie = dsaisie;
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
	public Specification_planification(String id, String activite, String client, String projet, String resp,
			String moa, String moe, String commentaire, String sponsor, String dsaisie, String contact,
			String echeance) {
		super();
		this.id = id;
		this.activite = activite;
		this.client = client;
		this.projet = projet;
		this.resp = resp;
		this.moa = moa;
		this.moe = moe;
		this.commentaire = commentaire;
		this.sponsor = sponsor;
		this.dsaisie = dsaisie;
		this.contact = contact;
		this.echeance = echeance;
	}
	public Specification_planification() {
		super();
		// TODO Auto-generated constructor stub
	}


}
