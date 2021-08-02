package org.springframework.samples.evipdus.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name= "usuarios")
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@NotBlank(message = "No debe estar vacio")
	private String name;

	
	@NotBlank(message = "No debe estar vacio")
	private String surname;

	
	@NotBlank(message = "No debe estar vacio")
	@javax.validation.constraints.Email
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "username", referencedColumnName ="username")
	private UserAccount userAccount;
	
	@OneToMany
	private List<Eipd> eipd;
	
	
	public String getFirstName() {
		return this.name;
	}

	public void setFirstName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.surname;
	}

	public void setLastName(String surname) {
		this.surname = surname;
	}
	
	public String getEmail() {
		return this.surname;
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

	public List<Eipd> getEipd() {
		return eipd;
	}

	public void setEipd(List<Eipd> eipd) {
		this.eipd = eipd;
	}
	

}
