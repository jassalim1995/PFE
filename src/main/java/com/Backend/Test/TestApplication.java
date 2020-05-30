package com.Backend.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.Backend.Test.Model.Client;
import com.Backend.Test.Model.Conversation;
import com.Backend.Test.Model.Conversation.Qualites;
import com.Backend.Test.Model.Entreprise;
import com.Backend.Test.Services.BesoinService;
import com.Backend.Test.Services.SequenceGenerator;
import com.Backend.Test.Repositories.*;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

	@Autowired
	private EntrepriseRepository EntrepriseRepository;
	@Autowired
	private ConversationRepository ConversationRepository;
	@Autowired
	private ClientRepository ClientRepository;
	
	@Autowired
	private BesoinService BesoinService;
	
	@Autowired
	private SequenceGenerator sequenceGenerator;
	
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

	    registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics/")
	            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	}
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Ajout d'une entreprise pour la fiche contact
	EntrepriseRepository.save(new Entreprise(sequenceGenerator.generateSequence(Entreprise.SEQUENCE_NAME),"AFP","Media","Agence de presse",
						"LSE","AFP Adresse",75002,"Paris","Notes",140404040,240404040,"Precision","prenom.nom@afp.com","Linkedin"));
	
		//Ajout quelques conversations
	ConversationRepository.save(new Conversation(sequenceGenerator.generateSequence(Conversation.SEQUENCE_NAME),new Date(),Qualites.TresBien,"conversation1","reponse1"));
	ConversationRepository.save(new Conversation(sequenceGenerator.generateSequence(Conversation.SEQUENCE_NAME),new Date(),Qualites.Bien,"conversation2","reponse2"));
	
	ClientRepository.save(new Client(sequenceGenerator.generateSequence(Client.SEQUENCE_NAME),"ingénieur", "SAIDAni","Oussema",123,"email","obs","linkedin",new Date()));
	ClientRepository.save(new Client(sequenceGenerator.generateSequence(Client.SEQUENCE_NAME),"consultante", "MEZZI","Siwar",123,"email","obs","linkedin",new Date()));
	ClientRepository.save(new Client(sequenceGenerator.generateSequence(Client.SEQUENCE_NAME),"Encadrente", "ABJEAN","Francoise",123,"email","obs","linkedin",new Date()));
	}

}
