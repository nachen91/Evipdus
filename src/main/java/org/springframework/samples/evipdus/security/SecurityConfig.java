package org.springframework.samples.evipdus.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	   
	 

	   	@Autowired
	    UserDetailsServiceImpl userDetailService;
	   	
	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(userDetailService);
	    }
	    
	   

	    
    String ROLE_ADMIN = String.valueOf(Rol.ROLE_ADMIN);
    String ROLE_USER = String.valueOf(Rol.ROLE_USER);
    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
            		
                    .authorizeRequests()
                    .antMatchers("/anonymous").permitAll()
                    .antMatchers("").hasRole(ROLE_USER)
                    .antMatchers("/admin").hasRole(ROLE_ADMIN)                
                    .and()
                    .formLogin()
                    	.loginPage("login").failureUrl("login-error");
	    }
    
    @Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("user").password("password").roles("USER")
				.and()
				.withUser("admin").password("password").roles("ADMIN");;
				
			
	}

}
