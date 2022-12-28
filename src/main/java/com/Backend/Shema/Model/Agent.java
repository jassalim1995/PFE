package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Agent")
public class Agent {
	@Id
	private String Id;
	private List<String>moa=new ArrayList<>();
	private List<String>moe=new ArrayList<>();
	private List<String>responsable=new ArrayList<>();
	private List<String>sponsor=new ArrayList<>();
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public List<String> getMoa() {
		return moa;
	}
	public void setMoa(List<String> moa) {
		this.moa = moa;
	}
	public List<String> getMoe() {
		return moe;
	}
	public void setMoe(List<String> moe) {
		this.moe = moe;
	}
	public List<String> getResponsable() {
		return responsable;
	}
	public void setResponsable(List<String> responsable) {
		this.responsable = responsable;
	}
	public List<String> getSponsor() {
		return sponsor;
	}
	public void setSponsor(List<String> sponsor) {
		this.sponsor = sponsor;
	}
	public Agent(String id, List<String> moa, List<String> moe, List<String> responsable, List<String> sponsor) {
		super();
		Id = id;
		this.moa = moa;
		this.moe = moe;
		this.responsable = responsable;
		this.sponsor = sponsor;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
