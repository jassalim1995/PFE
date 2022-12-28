package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Dev_Intégration")
public class Realisation_deploiment {
	@Id
	private String id;
	private String tache;
	private String statut;
	private String avancement;
	private String  resp;
	private String moa;
	private String moe;
	private String dossier;
	private List<String>dossinfo=new ArrayList<>();
	private String commentaire;
	private String sponsor;
	private String dsaisie;
	private String echeance;
	private  strategie strategie;
	private  planVerif planVerif;
	private  planValid planValid;
	private   Verif verif;
	private  Valid valid;
	private String projet;
	private String nomProj;
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
	public String getEcheance() {
		return echeance;
	}
	public void setEcheance(String echeance) {
		this.echeance = echeance;
	}
	public strategie getStrategie() {
		return strategie;
	}
	public void setStrategie(strategie strategie) {
		this.strategie = strategie;
	}
	public planVerif getPlanVerif() {
		return planVerif;
	}
	public void setPlanVerif(planVerif planVerif) {
		this.planVerif = planVerif;
	}
	public planValid getPlanValid() {
		return planValid;
	}
	public void setPlanValid(planValid planValid) {
		this.planValid = planValid;
	}
	public Verif getVerif() {
		return verif;
	}
	public void setVerif(Verif verif) {
		this.verif = verif;
	}
	public Valid getValid() {
		return valid;
	}
	public void setValid(Valid valid) {
		this.valid = valid;
	}
	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	public String getNomProj() {
		return nomProj;
	}
	public void setNomProj(String nomProj) {
		this.nomProj = nomProj;
	}
	
	

}
