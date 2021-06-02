package org.springframework.samples.evipdus.services;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.evipdus.model.UserAccount;
import org.springframework.samples.evipdus.repositories.UserAccountRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserAccountService {

	
	private UserAccountRepository userAccountRepository;
	
	
	public UserAccountService(final UserAccountRepository userAccountRepository) {
		this.userAccountRepository = userAccountRepository;
	}
	
	
	public UserAccount getCurrentUserAccount() throws DataAccessException {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		return this.userAccountRepository.findByUsername(username);
	}
	
	
	public void save(final UserAccount ua) throws DataAccessException{
		this.userAccountRepository.save(ua);
	}
	
	public void delete(final UserAccount ua) {
		this.userAccountRepository.delete(ua);
	}
}
