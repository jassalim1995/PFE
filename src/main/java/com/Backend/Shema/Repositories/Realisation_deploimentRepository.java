package com.Backend.Shema.Repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.Backend.Shema.Model.Realisation_deploiment;



@Repository
public interface Realisation_deploimentRepository extends MongoRepository<Realisation_deploiment, String> {


}	
