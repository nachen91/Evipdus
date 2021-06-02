/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.evipdus.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


/**
 * Simple JavaBean domain object representing an person.
 *
 */
@Entity
@Table(name= "usuarios")
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@NotBlank(message = "No debe estar vacio")
	private String firstName;

	
	@NotBlank(message = "No debe estar vacio")
	private String lastName;

	
	@NotBlank(message = "No debe estar vacio")
	@javax.validation.constraints.Email
	private String email;
	
	@JoinColumn(name = "userAccounts", referencedColumnName ="username")
	@NotEmpty
	private UserAccount userAccount;
	
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return this.lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	

}
