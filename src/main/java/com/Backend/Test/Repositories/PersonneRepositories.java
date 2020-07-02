package com.Backend.Test.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Backend.Test.Model.Personne;
import com.Backend.Test.Model.Technologie;

@Repository
public interface PersonneRepositories extends MongoRepository<Personne, String> {
	@Query("{ 'nom' : ?0 }")
	Personne findPresonneByName(String name);

	@Query("{\"technologies.libelle\":{$all: ?0},\"tag.libelle\": {$all: ?1}, \"action.libelle\": {$all: ?2}}")
	List<Personne> findUsersByQuery(List<String> techno, List<String> tags, List<String> actions);
}
