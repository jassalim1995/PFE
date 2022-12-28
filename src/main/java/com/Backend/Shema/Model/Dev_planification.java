package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Dev_planification")
public class Dev_planification {
	@Id
	private String id;
	private String tache;
	private String statut;
	private String avancement;
	private String resp;
	private String moa;
	private String moe;
	private String dossier;
	private List<String>dossinfo=new ArrayList<>();
	private String commentaire;
	private String projet;
	private String dsaisie;
	private String echeance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTache() {
		return tache;
	}
	public void setTache(String tache) {
		this.tache = tache;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getAvancement() {
		return avancement;
	}
	public void setAvancement(String avancement) {
		this.avancement = avancement;
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
	public String getDossier() {
		return dossier;
	}
	public void setDossier(String dossier) {
		this.dossier = dossier;
	}
	public List<String> getDossinfo() {
		return dossinfo;
	}
	public void setDossinfo(List<String> dossinfo) {
		this.dossinfo = dossinfo;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getDsaisie() {
		return dsaisie;
	}
	public void setDsaisie(String dsaisie) {
		this.dsaisie = dsaisie;
	}
	public String getEcheance() {
		return echeance;
	}
	public void setEcheance(String echeance) {
		this.echeance = echeance;
	}

	
	public String getResp() {
		return resp;
	}
	public void setResp(String resp) {
		this.resp = resp;
	}


	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	
	public Dev_planification(String id, String tache, String statut, String avancement, String resp, String moa,
			String moe, String dossier, List<String> dossinfo, String commentaire, String projet, String dsaisie,
			String echeance) {
		super();
		this.id = id;
		this.tache = tache;
		this.statut = statut;
		this.avancement = avancement;
		this.resp = resp;
		this.moa = moa;
		this.moe = moe;
		this.dossier = dossier;
		this.dossinfo = dossinfo;
		this.commentaire = commentaire;
		this.projet = projet;
		this.dsaisie = dsaisie;
		this.echeance = echeance;
	}
	public Dev_planification() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
