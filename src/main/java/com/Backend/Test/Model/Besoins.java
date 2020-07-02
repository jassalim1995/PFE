package com.Backend.Test.Model;

import java.util.*;

public class Besoins {

	public enum Statut {
		signé, terminé,encours
	};
	private Date dateSaisie;
	private String description;
	private Ao ao;
	private List<Cv> cvs;
	private Statut statut;
	private String trigramme;
	
	public Besoins() {
		super();
		this.cvs = new ArrayList<>();
	}

	public Besoins(Date dateSaisie, String description, Ao ao, List<Cv> cVs, Statut statut,String trigramme) {
		super();
		this.dateSaisie = dateSaisie;
		this.description = description;
		this.ao = ao;
		this.cvs = cVs;
		this.statut = statut;
		this.trigramme = trigramme;
	}

	public Date getDateSaisie() {
		return dateSaisie;
	}

	public void setDateSaisie(Date dateSaisie) {
		this.dateSaisie = dateSaisie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Ao getAo() {
		return ao;
	}

	public void setAo(Ao ao) {
		this.ao = ao;
	}

	public List<Cv> getCVs() {
		return cvs;
	}

	public void setCVs(List<Cv> cVs) {
		this.cvs = cVs;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public String getTrigramme() {
		return trigramme;
	}

	public void setTrigramme(String trigramme) {
		this.trigramme = trigramme;
	}
	
	
	
	
}
