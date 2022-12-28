package com.Backend.Shema.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Backend.Shema.Model.Specification_planification;
import com.Backend.Shema.Model.Workflow;



@Repository
public interface Specification_planificationRepository extends MongoRepository<Specification_planification, String> {

	List<Specification_planification> findByClientStartingWith(String client);
	List<Specification_planification> findByProjetStartingWith(String projet);
	List<Specification_planification> findByContactStartingWith(String contact);
	List<Specification_planification> findByActiviteStartingWith(String activite);
}	
