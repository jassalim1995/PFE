package com.Backend.Shema.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Backend.Shema.Model.MEP_planification;
import com.Backend.Shema.Model.MEP_suivi;
import com.Backend.Shema.Model.Spec_suivi;
import com.Backend.Shema.Model.Specification_planification;
import com.Backend.Shema.Model.Workflow;



@Repository
public interface Spec_suiviRepository extends MongoRepository<Spec_suivi, String> {

	
}	
