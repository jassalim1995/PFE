package com.Backend.Test.Model;

import java.util.Date;

public class Ao {
	
	private String statut;
	private String nomFIchier ;
	private String heminFIchier ;
	private Date dateEnregistrement ;

	
	public Ao() {
		super();
	}
	
	
	
	public Ao(String statut, String nomFIchier, String heminFIchier, Date dateEnregistrement) {
		super();
		this.statut = statut;
		this.nomFIchier = nomFIchier;
		this.heminFIchier = heminFIchier;
		this.dateEnregistrement = dateEnregistrement;
	}



	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getNomFIchier() {
		return nomFIchier;
	}
	public void setNomFIchier(String nomFIchier) {
		this.nomFIchier = nomFIchier;
	}
	public String getHeminFIchier() {
		return heminFIchier;
	}
	public void setHeminFIchier(String heminFIchier) {
		this.heminFIchier = heminFIchier;
	}
	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}
	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}
	
}
