package org.springframework.samples.evipdus.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.samples.evipdus.enums.Level;

@Entity
@Table (name = "riskManagement")
public class RiskManagement {

	
	

	private boolean answers;
	
	private Level probability;
	
	private Level impactLevel;
	
	private Level riskInh;
	
	private Level riskRes;
	
	
	
	public boolean isAnswers() {
		return answers;
	}

	public void setAnswers(boolean answers) {
		this.answers = answers;
	}

	public Level getProbability() {
		return probability;
	}

	public void setProbability(Level probability) {
		this.probability = probability;
	}

	public Level getImpactLevel() {
		return impactLevel;
	}

	public void setImpactLevel(Level impactLevel) {
		this.impactLevel = impactLevel;
	}

	public Level getRiskInh() {
		return riskInh;
	}

	public void setRiskInh(Level riskInh) {
		this.riskInh = riskInh;
	}

	public Level getRiskRes() {
		return riskRes;
	}

	public void setRiskRes(Level riskRes) {
		this.riskRes = riskRes;
	}
}
