package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Workflow")
public class Workflow {
	@Id
	private String id;
	private String titre;
	private List<Node> NodeList=new ArrayList<>();
	private List<Link>LinkList=new ArrayList<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public List<Node> getNodeList() {
		return NodeList;
	}
	public void setNodeList(List<Node> nodeList) {
		NodeList = nodeList;
	}
	public List<Link> getLinkList() {
		return LinkList;
	}
	public void setLinkList(List<Link> linkList) {
		LinkList = linkList;
	}
	public Workflow() {
		super();
	}
	public Workflow(String titre) {
		super();
		this.titre = titre;
	}
	public Workflow(String id, String titre, List<Node> nodeList, List<Link> linkList) {
		super();
		this.id = id;
		this.titre = titre;
		NodeList = nodeList;
		LinkList = linkList;
	}
	
	


	
	

}
