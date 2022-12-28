package com.Backend.Test.Model;

import java.util.Date;

public class Cv {
	
	private String idConsultant;
    private String nomConsultant;
    private String prenomConsultant;
    private String nomCV;
    private String cheminCV;
    private Date dateEnvoiCV;
    
    
	public Cv() {
		super();
	}


	public Cv(String idConsultant, String nomConsultant, String prenomConsultant, String nomCV, String cheminCV,
			Date dateEnvoiCV) {
		super();
		this.idConsultant = idConsultant;
		this.nomConsultant = nomConsultant;
		this.prenomConsultant = prenomConsultant;
		this.nomCV = nomCV;
		this.cheminCV = cheminCV;
		this.dateEnvoiCV = dateEnvoiCV;
	}


	public String getIdConsultant() {
		return idConsultant;
	}


	public void setIdConsultant(String idConsultant) {
		this.idConsultant = idConsultant;
	}


	public String getNomConsultant() {
		return nomConsultant;
	}


	public void setNomConsultant(String nomConsultant) {
		this.nomConsultant = nomConsultant;
	}


	public String getPrenomConsultant() {
		return prenomConsultant;
	}


	public void setPrenomConsultant(String prenomConsultant) {
		this.prenomConsultant = prenomConsultant;
	}


	public String getNomCV() {
		return nomCV;
	}


	public void setNomCV(String nomCV) {
		this.nomCV = nomCV;
	}


	public String getCheminCV() {
		return cheminCV;
	}


	public void setCheminCV(String cheminCV) {
		this.cheminCV = cheminCV;
	}


	public Date getDateEnvoiCV() {
		return dateEnvoiCV;
	}


	public void setDateEnvoiCV(Date dateEnvoiCV) {
		this.dateEnvoiCV = dateEnvoiCV;
	}
	
    
    
    
}
	