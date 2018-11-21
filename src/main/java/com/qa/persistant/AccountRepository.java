package com.qa.persistant;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface AccountRepository extends MongoRepository<Account, String>
{
	public Account findByUsername(String username);
}
