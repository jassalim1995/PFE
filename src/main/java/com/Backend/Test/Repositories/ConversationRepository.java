package com.Backend.Test.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Backend.Test.Model.Conversation;

@Repository
public interface ConversationRepository extends MongoRepository<Conversation, Long>  {

}
