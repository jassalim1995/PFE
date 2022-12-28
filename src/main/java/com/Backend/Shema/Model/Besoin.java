package com.Backend.Test.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "besoin")
public class Besoin {

	@Transient
	public static final String SEQUENCE_NAME = "Besoin_sequence";
	
	@Id
	private long id;
	
	private String besoin;
	private String ao;
	private String statut;
	private String cv;
	
	
	public Besoin() {
		super();
	}

	public Besoin(long id, String besoin, String aO, String statut, String cv) {
		super();
		this.id = id;
		this.besoin = besoin;
		ao = aO;
		statut = statut;
		this.cv = cv;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBesoin() {
		return besoin;
	}

	public void setBesoin(String besoin) {
		this.besoin = besoin;
	}

	public String getAO() {
		return ao;
	}

	public void setAO(String aO) {
		ao = aO;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return "Besoin [id=" + id + ", besoin=" + besoin + ", AO=" + ao + ", Statut=" + statut + ", cv=" + cv + "]";
	}
	
	
	
	
}
