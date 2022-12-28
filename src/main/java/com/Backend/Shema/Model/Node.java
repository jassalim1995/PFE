package com.Backend.Shema.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "NodeList")
public class Node {
	@Id
	private String Id;
	private String label;
	private String image;
	private String etat;
	private String value;
	private String data;
	private String type;
	
	public Node() {
		super();
	}


	public String getId() {
		return Id;
	}

	public void setId(String id) {
		this.Id = id;
	}


	public String getLabel() {
		return label;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}





	public Node(String id, String label, String image, String etat, String value, String data, String type) {
		super();
		Id = id;
		this.label = label;
		this.image = image;
		this.etat = etat;
		this.value = value;
		this.data = data;
		this.type = type;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public Node(String id, String label, String image, String name, String value, String data) {
		super();
		Id = id;
		this.label = label;
		this.image = image;
		this.value = value;
		this.data = data;
	}


}
