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

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * Simple JavaBean domain object representing an person.
 *
 */
@Entity
@Table(name= "eipd")
public class Eipd extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@NotBlank(message = "No debe estar vacio")
	private String name;

	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Debe introducir una fecha de inicio")
	private LocalTime startDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Debe introducir una fecha de fin")
	private LocalTime finishDate;
	
	@NotBlank(message = "No debe estar vacio")
	private String responsibleEIPD;
	
	@NotBlank(message = "No debe estar vacio")
	private String dataProtectionOfficer;
	
	@NotBlank(message = "No debe estar vacio")
	private String dataProtectionResponsible;
	
	@NotBlank(message = "No debe estar vacio")
	private String responsibleRACI;
	
	@NotBlank(message = "No debe estar vacio")
	private String approverRACI;
	
	@NotBlank(message = "No debe estar vacio")
	private String consultedRACI;
	
	@NotBlank(message = "No debe estar vacio")
	private String informedRACI;
	
	@NotBlank(message = "No debe estar vacio")
	private String description;
	
	@NotNull
	private LifeCycle lifecycle;
	
	
	@NotNull
	private AnalOfNeceProp anaOfNeceProp;
	
	@NotNull
	private RiskManagement riskManagement;
	
	private ActionPlan actionplan;
	
	@NotBlank(message = "No debe estar vacio")
	private String conclusion;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalTime startDate) {
		this.startDate = startDate;
	}

	public LocalTime getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalTime finishDate) {
		this.finishDate = finishDate;
	}

	public String getResponsibleEIPD() {
		return responsibleEIPD;
	}

	public void setResponsibleEIPD(String responsibleEIPD) {
		this.responsibleEIPD = responsibleEIPD;
	}

	public String getDataProtectionOfficer() {
		return dataProtectionOfficer;
	}

	public void setDataProtectionOfficer(String dataProtectionOfficer) {
		this.dataProtectionOfficer = dataProtectionOfficer;
	}

	public String getDataProtectionResponsible() {
		return dataProtectionResponsible;
	}

	public void setDataProtectionResponsible(String dataProtectionResponsible) {
		this.dataProtectionResponsible = dataProtectionResponsible;
	}

	public String getResponsibleRACI() {
		return responsibleRACI;
	}

	public void setResponsibleRACI(String responsibleRACI) {
		this.responsibleRACI = responsibleRACI;
	}

	public String getApproverRACI() {
		return approverRACI;
	}

	public void setApproverRACI(String approverRACI) {
		this.approverRACI = approverRACI;
	}

	public String getConsultedRACI() {
		return consultedRACI;
	}

	public void setConsultedRACI(String consultedRACI) {
		this.consultedRACI = consultedRACI;
	}

	public String getInformedRACI() {
		return informedRACI;
	}

	public void setInformedRACI(String informedRACI) {
		this.informedRACI = informedRACI;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public LifeCycle getLifecycle() {
		return lifecycle;
	}

	public void setLifecycle(LifeCycle lifecycle) {
		this.lifecycle = lifecycle;
	}

	public AnalOfNeceProp getAnaOfNeceProp() {
		return anaOfNeceProp;
	}

	public void setAnaOfNeceProp(AnalOfNeceProp anaOfNeceProp) {
		this.anaOfNeceProp = anaOfNeceProp;
	}

	public RiskManagement getRiskManagement() {
		return riskManagement;
	}

	public void setRiskManagement(RiskManagement riskManagement) {
		this.riskManagement = riskManagement;
	}

	public ActionPlan getActionplan() {
		return actionplan;
	}

	public void setActionplan(ActionPlan actionplan) {
		this.actionplan = actionplan;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	
	
	
	
	
	

}
