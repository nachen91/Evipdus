package org.springframework.samples.evipdus.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	   
	   	@Autowired
	    LoginService loginService;

	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(loginService);
	    }
	    
	    @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
	        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	        return bCryptPasswordEncoder;
	    }

	    protected void configure2(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(loginService).passwordEncoder(passwordEncoder());
	    }
	    
//	    String ROLE_ADMIN = String.valueOf(Rol.ROLE_ADMIN);
//	    @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	            http
//	                    .authorizeRequests()
//	                    .antMatchers("/admin").hasRole(ROLE_ADMIN)                
//	                    .and()
//	                    .formLogin();
//	    }

}
