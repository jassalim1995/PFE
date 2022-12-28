package com.Backend.Shema.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Backend.Shema.Model.Specification_planification;
import com.Backend.Shema.Model.Workflow;
import com.Backend.Shema.Model.Projets;


@Repository
public interface ProjetsRepository extends MongoRepository<Projets , String> {

	List<Projets> findByClientStartingWith(String client);
	List<Projets> findByProjetStartingWith(String projet);
	List<Projets> findByContactStartingWith(String contact);
	List<Projets> findByActiviteStartingWith(String activite);
	List<Projets> findByEcheanceStartingWith(String echeance);
}	
