package org.springframework.samples.evipdus.service;


import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.evipdus.model.User;
import org.springframework.samples.evipdus.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserService {
	private UserRepository userRepository;
	
	
	public UserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	public User getCurrentUser() throws DataAccessException {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		return this.userRepository.findByUsername(username);
	}
	
	public User findByUsername(final String username) throws DataAccessException{
		return this.userRepository.findByUsername(username);
		
	}
	
	public User findById(final Integer id) throws DataAccessException{
		return this.userRepository.findById(id).get();
	}
	
	public List<User> findAllUser(final Pageable page) throws DataAccessException{
		return this.userRepository.findAllUser(page);
	}
	
	public void saveUser(final User user) throws DataAccessException{
		this.userRepository.save(user);
	}
	
	public void deleteUser(final User user) throws DataAccessException{
		
		this.userRepository.delete(user);
	}
	
	
	
	


}
