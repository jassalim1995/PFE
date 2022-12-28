package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "MEP_suivi")
public class MEP_suivi {
	@Id
	private String id;
	private String tache;
	private String activite;
	private String statut;
	private String avancement;
	private String echeance;
	private String test;
	private List<String>testinfo=new ArrayList<>();
	private String validation;
	private List<String>validationinfo=new ArrayList<>();
	private String recette;
	private List<String>recetteinfo=new ArrayList<>();
	private String cloturation;
	private List<String>cloturationinfo=new ArrayList<>();
	private String commentaire;
	private String projet;
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
	public String getEcheance() {
		return echeance;
	}
	public void setEcheance(String echeance) {
		this.echeance = echeance;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public List<String> getTestinfo() {
		return testinfo;
	}
	public void setTestinfo(List<String> testinfo) {
		this.testinfo = testinfo;
	}
	public String getValidation() {
		return validation;
	}
	public void setValidation(String validation) {
		this.validation = validation;
	}
	public List<String> getValidationinfo() {
		return validationinfo;
	}
	public void setValidationinfo(List<String> validationinfo) {
		this.validationinfo = validationinfo;
	}
	public String getRecette() {
		return recette;
	}
	public void setRecette(String recette) {
		this.recette = recette;
	}
	public List<String> getRecetteinfo() {
		return recetteinfo;
	}
	public void setRecetteinfo(List<String> recetteinfo) {
		this.recetteinfo = recetteinfo;
	}
	public String getCloturation() {
		return cloturation;
	}
	public void setCloturation(String cloturation) {
		this.cloturation = cloturation;
	}
	public List<String> getCloturationinfo() {
		return cloturationinfo;
	}
	public void setCloturationinfo(List<String> cloturationinfo) {
		this.cloturationinfo = cloturationinfo;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public MEP_suivi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	public MEP_suivi(String id, String tache, String activite, String statut, String avancement, String echeance,
			String test, List<String> testinfo, String validation, List<String> validationinfo, String recette,
			List<String> recetteinfo, String cloturation, List<String> cloturationinfo, String commentaire,
			String projet) {
		super();
		this.id = id;
		this.tache = tache;
		this.activite = activite;
		this.statut = statut;
		this.avancement = avancement;
		this.echeance = echeance;
		this.test = test;
		this.testinfo = testinfo;
		this.validation = validation;
		this.validationinfo = validationinfo;
		this.recette = recette;
		this.recetteinfo = recetteinfo;
		this.cloturation = cloturation;
		this.cloturationinfo = cloturationinfo;
		this.commentaire = commentaire;
		this.projet = projet;
	}
	
	
	
	

	
	

}
