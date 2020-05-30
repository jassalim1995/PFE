package com.Backend.Test.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Backend.Test.Model.Besoin;

@Repository
public interface BesoinRepository extends MongoRepository<Besoin, Long> {

}
