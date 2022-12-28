package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Dev_Spécification")
public class MEP_planification {
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
	private String projet;
	private String nomProj;
	private String dsaisie;
	private String echeance;
	private Spécifications_générales sg;
	private Dossier_architecture da;
	private Spécifications_détaillées sd;
	private Dossier_exploitation de;
	private Plan_gestion_configuration pgc;
	

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
	public String getResp() {
		return resp;
	}
	public void setResp(String resp) {
		this.resp = resp;
	}
	public Spécifications_générales getSg() {
		return sg;
	}
	public void setSg(Spécifications_générales sg) {
		this.sg = sg;
	}
	public Dossier_architecture getDa() {
		return da;
	}
	public void setDa(Dossier_architecture da) {
		this.da = da;
	}
	public Spécifications_détaillées getSd() {
		return sd;
	}
	public void setSd(Spécifications_détaillées sd) {
		this.sd = sd;
	}

	public Plan_gestion_configuration getPgc() {
		return pgc;
	}
	public void setPgc(Plan_gestion_configuration pgc) {
		this.pgc = pgc;
	}

	public MEP_planification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dossier_exploitation getDe() {
		return de;
	}
	public void setDe(Dossier_exploitation de) {
		this.de = de;
	}
	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	public MEP_planification(String id, String tache, String statut, String avancement, String resp, String moa,
			String moe, String dossier, List<String> dossinfo, String commentaire, String projet, String dsaisie,
			String echeance, Spécifications_générales sg, Dossier_architecture da, Spécifications_détaillées sd,
			Dossier_exploitation de, Plan_gestion_configuration pgc) {
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
		this.sg = sg;
		this.da = da;
		this.sd = sd;
		this.de = de;
		this.pgc = pgc;
	}
	public String getNomProj() {
		return nomProj;
	}
	public void setNomProj(String nomProj) {
		this.nomProj = nomProj;
	}


	
	

}
