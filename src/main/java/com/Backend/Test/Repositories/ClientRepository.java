package com.Backend.Test.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Backend.Test.Model.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, Long> {

}
