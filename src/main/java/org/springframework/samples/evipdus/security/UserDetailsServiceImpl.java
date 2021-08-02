package org.springframework.samples.evipdus.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.evipdus.repository.UserAccountRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	 	@Autowired
	    private UserAccountRepository userAccountRepository;
	    
	    @Override
	    public UserDetails loadUserByUsername(String username){
	        return userAccountRepository.findByUsername(username);
	    }
	    
	
}
