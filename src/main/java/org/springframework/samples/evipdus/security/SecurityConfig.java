package org.springframework.samples.evipdus.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	   
	 

//	   	@Autowired
//	    UserDetailsServiceImpl userDetailService;
//	   	
//	    @Override
//	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	        auth.userDetailsService(userDetailService);
//	    }
//	    
	   

	    

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
            		
                    .authorizeRequests()
                    .antMatchers("/anonymous").permitAll()
                    .antMatchers("/user").hasAnyAuthority("user")
                    .antMatchers("/admin").hasAnyAuthority("admin")                
                    .and()
                    .formLogin()
                    	.loginPage("/login").failureUrl("/login?error")
                    	.and().logout().logoutSuccessUrl("/");
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
