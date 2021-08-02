package org.springframework.samples.evipdus.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.evipdus.security.Authority;
import org.springframework.transaction.annotation.Transactional;

public interface AuthorityRepository extends CrudRepository<Authority,String>{

	
	@Query ("SELECT authority FROM Authority WHERE authority.username=:username")
	@Transactional(readOnly = true)
	Authority findAuthorityByUsername(String username);
}
