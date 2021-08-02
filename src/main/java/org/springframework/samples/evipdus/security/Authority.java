/*
 * Authority.java
 * 
 * Copyright (C) 2017 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package org.springframework.samples.evipdus.security;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="authority")
public class Authority  {



	// Values -----------------------------------------------------------------

	public static final String	ADMINISTRATOR	= "ADMINISTRATOR";
	public static final String	USER	= "USER";
	
	// Attributes -------------------------------------------------------------

	@Id
	String username;
	
	String authority;


	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Pattern(regexp = "^" + Authority.ADMINISTRATOR + "|" + Authority.USER + "$")
	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(final String authority) {
		this.authority = authority;
	}

	public static Collection<Authority> listAuthorities() {
		Collection<Authority> result;
		Authority authority;

		result = new ArrayList<Authority>();

		authority = new Authority();
		authority.setAuthority(Authority.ADMINISTRATOR);
		result.add(authority);

		authority = new Authority();
		authority.setAuthority(Authority.USER);
		result.add(authority);

		return result;
	}

	// Equality ---------------------------------------------------------------

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authority == null) ? 0 : authority.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		boolean result = false;

		if (this == obj)
			result = true;
		else if (obj == null)
			result = false;
		else if (this.getClass() != obj.getClass())
			result = false;
		
		Authority other = (Authority) obj;
		if(other.authority != null) {
			if(other.authority != null) 
			result =  false;
			}
		else if (!authority.equals(other.authority))
				result = false;
		if (username == null) {
			if(other.username != null)
				result = false;
		}
		else if(!username.equals(other.username))
			result = false;
		
		else
			result = (this.getAuthority().equals(((Authority) other).getAuthority()));

		return result;
	}
	
	public String toString() {
		return "Authority [username=" + username + ", authority =" + authority + "]";
	}
	
	
	}
	

