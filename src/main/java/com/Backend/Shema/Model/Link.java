package com.Backend.Shema.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Document(collection = "LinkList")
public class Link {
	@Id
	private String Id;
	private String source;
	private String target;
	private String label;
	
	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Link() {
		super();
	}


	public String getId() {
		return Id;
	}

	public void setId(String id) {
		this.Id = id;
	}

	public Link(String id, String source, String target, String label) {
		super();
		Id = id;
		this.source = source;
		this.target = target;
		this.label = label;
	}



}
