package com.Backend.Test.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Backend.Test.Model.Clients;

@Repository
public interface ClientsRepository extends MongoRepository<Clients, String> {

}
