package com.Backend.Test.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Backend.Test.Model.Entreprise;

@Repository
public interface EntrepriseRepository extends MongoRepository<Entreprise, Long>{

}
