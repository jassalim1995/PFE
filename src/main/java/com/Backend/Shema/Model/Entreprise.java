package com.Backend.Test.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "entreprise")
public class Entreprise {
	
			@Transient
			public static final String SEQUENCE_NAME = "entreprise_sequence";
	
			@Id
			private long id;
			
			private String nom;
			private String secteur;
			private String activite;
			private String droit;
			private String adresse;
			private int cp;
			private String ville;
			private String note;
			private int tel1;
			private int tel2;
			private String precision;
			private String email;
			private String linkedin;
			
			
			public Entreprise() {
			}


			public Entreprise(long id, String nom, String secteur, String activite, String droit, String adresse, int cp,
					String ville, String note, int tel1, int tel2, String precision, String email, String linkedin) {
				this.id = id;
				this.nom = nom;
				this.secteur = secteur;
				this.activite = activite;
				this.droit = droit;
				this.adresse = adresse;
				this.cp = cp;
				this.ville = ville;
				this.note = note;
				this.tel1 = tel1;
				this.tel2 = tel2;
				this.precision = precision;
				this.email = email;
				this.linkedin = linkedin;
			}


			public long getId() {
				return id;
			}


			public void setId(long id) {
				this.id = id;
			}


			public String getNom() {
				return nom;
			}


			public void setNom(String nom) {
				this.nom = nom;
			}


			public String getSecteur() {
				return secteur;
			}


			public void setSecteur(String secteur) {
				this.secteur = secteur;
			}


			public String getActivite() {
				return activite;
			}


			public void setActivite(String activite) {
				this.activite = activite;
			}


			public String getDroit() {
				return droit;
			}


			public void setDroit(String droit) {
				this.droit = droit;
			}


			public String getAdresse() {
				return adresse;
			}


			public void setAdresse(String adresse) {
				this.adresse = adresse;
			}


			public int getCP() {
				return cp;
			}


			public void setCP(int CP) {
				this.cp = CP;
			}


			public String getVille() {
				return ville;
			}


			public void setVille(String ville) {
				this.ville = ville;
			}


			public String getNote() {
				return note;
			}


			public void setNote(String note) {
				this.note = note;
			}


			public int getTel1() {
				return tel1;
			}


			public void setTel1(int tel1) {
				this.tel1 = tel1;
			}


			public int getTel2() {
				return tel2;
			}


			public void setTel2(int tel2) {
				this.tel2 = tel2;
			}


			public String getPrecision() {
				return precision;
			}


			public void setPrecision(String precision) {
				this.precision = precision;
			}


			public String getEmail() {
				return email;
			}


			public void setEmail(String email) {
				this.email = email;
			}


			public String getLinkedin() {
				return linkedin;
			}


			public void setLinkedin(String linkedin) {
				this.linkedin = linkedin;
			}


			@Override
			public String toString() {
				return "Entreprise [id=" + id + ", nom=" + nom + ", secteur=" + secteur + ", activite=" + activite
						+ ", droit=" + droit + ", adresse=" + adresse + ", CP=" + cp + ", ville=" + ville + ", note="
						+ note + ", tel1=" + tel1 + ", tel2=" + tel2 + ", precision=" + precision + ", email=" + email
						+ ", linkedin=" + linkedin + "]";
			}
			
}
