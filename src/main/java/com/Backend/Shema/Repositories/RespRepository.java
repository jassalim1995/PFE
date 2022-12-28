package com.Backend.Shema.Repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Backend.Shema.Model.Client;
import com.Backend.Shema.Model.User;
import com.Backend.Shema.Model.refMOA;
import com.Backend.Shema.Model.refResp;




@Repository
public interface RespRepository extends MongoRepository<refResp, String> {
	

	

}	
