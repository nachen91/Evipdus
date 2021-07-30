package org.springframework.samples.evipdus.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.samples.evipdus.model.UserAccount;
import org.springframework.transaction.annotation.Transactional;

public interface UserAccountRepository extends Repository<UserAccount, Integer>{

	
	
	
	@Query("SELECT ua FROM UserAccount ua WHERE username=:username")
	@Transactional(readOnly = true)
	UserAccount findByUsername(String username);
	
	
	@Query("SELECT (count(*) > 0) FROM  UserAccount ua WHERE username=:username")
	@Transactional(readOnly = true)
	Boolean duplicateUsername(String username);
	
	void save(UserAccount userA);
	
	void delete(UserAccount userA);
	
	
	
}
