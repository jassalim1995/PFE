package com.Backend.Shema;


import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.Backend.Shema.Model.Link;
import com.Backend.Shema.Model.Node;
import com.Backend.Shema.Model.Workflow;
import com.Backend.Shema.Repositories.*;
import com.Backend.Shema.Services.WorkflowService;


@SpringBootApplication
public class TestApplication implements CommandLineRunner {
   
	@Autowired
	private WorkflowRepository wf;
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

	    registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics/")
	            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	}
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
	Link l1 =new Link("a","1","2","33");
	Link l2 =new Link("b","1","3","54");
	Link l3 =new Link("c","3","4","15");
	Node n1=new Node("1","preparation","https://randomuser.me/api/portraits/women/27.jpg","hello","null","data");
	Node n2=new Node("2","Lancement","https://randomuser.me/api/portraits/women/66.jpg","hello","null","data");
	Node n3=new Node("3","Suivi","https://randomuser.me/api/portraits/women/21.jpg","hello","null","data");
	Node n4=new Node("4","maintenant","https://randomuser.me/api/portraits/women/22.jpg","hello","null","data");
	Workflow w=new Workflow();
	w.getLinkList().add(l1);
	w.getLinkList().add(l2);
	w.getLinkList().add(l3);
	w.getNodeList().add(n1);
	w.getNodeList().add(n2);
	w.getNodeList().add(n3);
	w.getNodeList().add(n4);
	wf.save(w);*/
}
 
}