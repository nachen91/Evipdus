package org.springframework.samples.evipdus.service;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.evipdus.repository.AuthorityRepository;
import org.springframework.samples.evipdus.security.Authority;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AuthorityService {

	private AuthorityRepository authorityRepository;
	
	
	public Authority findAuthorityByUsername(String username){
		return this.authorityRepository.findAuthorityByUsername(username);
	}
	
	
	
	public void saveAuthority(Authority authority) throws DataAccessException{
		this.authorityRepository.save(authority);
	}
	
	public void saveAuthority2(String username, String rol) throws DataAccessException{
		Authority authority = new Authority();
		authority.setUsername(username);
		authority.setAuthority(rol);
		authorityRepository.save(authority);
		
	}
}
