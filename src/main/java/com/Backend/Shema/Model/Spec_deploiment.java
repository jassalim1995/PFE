package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Dev_realisation")
public class Spec_deploiment {
	@Id
	private String id;
	private String tache;
	private String statut;
	private String avancement;
	private String resp;
	private String moa;
	private String moe;
	private String commentaire;
	private String sponsor;
	private String dsaisie;
	private String dossier;
	private String projet;
	private String nomProj;
	private List<String>dossinfo=new ArrayList<>();
	private String echeance;
	private DocumentationCode docCode;
	private Algorithme algo;
	private Interface interfaces;
	private Minstallation mInstallation;
	private Mutilisateur manuelUtilisateur;
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
	public String getEcheance() {
		return echeance;
	}
	public void setEcheance(String echeance) {
		this.echeance = echeance;
	}
	public DocumentationCode getDocCode() {
		return docCode;
	}
	public void setDocCode(DocumentationCode docCode) {
		this.docCode = docCode;
	}
	public Algorithme getAlgo() {
		return algo;
	}
	public void setAlgo(Algorithme algo) {
		this.algo = algo;
	}
	public Interface getInterfaces() {
		return interfaces;
	}
	public void setInterfaces(Interface interfaces) {
		this.interfaces = interfaces;
	}
	public Minstallation getmInstallation() {
		return mInstallation;
	}
	public void setmInstallation(Minstallation mInstallation) {
		this.mInstallation = mInstallation;
	}
	public Mutilisateur getManuelUtilisateur() {
		return manuelUtilisateur;
	}
	public void setManuelUtilisateur(Mutilisateur manuelUtilisateur) {
		this.manuelUtilisateur = manuelUtilisateur;
	}
	public Spec_deploiment(String id, String tache, String statut, String avancement, String resp, String moa,
			String moe, String commentaire, String sponsor, String dsaisie, String dossier, List<String> dossinfo,
			String echeance, DocumentationCode docCode, Algorithme algo, Interface interfaces,
			Minstallation mInstallation, Mutilisateur manuelUtilisateur) {
		super();
		this.id = id;
		this.tache = tache;
		this.statut = statut;
		this.avancement = avancement;
		this.resp = resp;
		this.moa = moa;
		this.moe = moe;
		this.commentaire = commentaire;
		this.sponsor = sponsor;
		this.dsaisie = dsaisie;
		this.dossier = dossier;
		this.dossinfo = dossinfo;
		this.echeance = echeance;
		this.docCode = docCode;
		this.algo = algo;
		this.interfaces = interfaces;
		this.mInstallation = mInstallation;
		this.manuelUtilisateur = manuelUtilisateur;
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
