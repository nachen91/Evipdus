/*
 * LoginController.java
 * 
 * Copyright (C) 2017 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package org.springframework.samples.evipdus.security;

import org.springframework.samples.evipdus.service.UserService;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController  {
	//extends AbstractController
	// Supporting services ----------------------------------------------------
	private final UserService userService;
	//@Autowired
	//LoginService	service;


	// Constructors -----------------------------------------------------------

	public LoginController(final UserService userService) {
		//super();
		this.userService = userService;
	}

	// Login ------------------------------------------------------------------
	@GetMapping("/login")
	public String login() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
			if (auth == null || auth instanceof AnonymousAuthenticationToken) {
				
				return "login";
						
			}
					
		return "redirect:/";
		
	}
 

}
