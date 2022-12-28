package com.Backend.Shema.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.Backend.Shema.Model.Workflow;



@Repository
public interface WorkflowRepository extends MongoRepository<Workflow, String> {

	@Query("{'titre' : ?0 }")
	Workflow findWorkflowByTitre(String titre);
	List<Workflow>findByTitre(String titre);
	@Query("{'_id' : ?0 }")
	Workflow findOne(String id);
}	
