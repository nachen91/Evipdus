package org.springframework.samples.evipdus.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.samples.evipdus.model.User;
import org.springframework.samples.evipdus.model.UserAccount;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends PagingAndSortingRepository<User, Integer>{

	@Query("SELECT u from User u where u.userAccount.id =:id")
	@Transactional(readOnly = true)
	UserAccount findByUserAccount(String username);
	
	@Query("SELECT u FROM User u WHERE username=:username")
	@Transactional(readOnly = true)
	User findByUsername(String usename);
	
	
	@Query("SELECT user FROM User u")
	@Transactional(readOnly = true)
	List<User> findAllUser(Pageable page);
}
