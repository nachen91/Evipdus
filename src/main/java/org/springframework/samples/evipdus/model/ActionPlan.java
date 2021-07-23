package org.springframework.samples.evipdus.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "actionPlan")
public class ActionPlan extends BaseEntity{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@NotBlank(message = "No debe estar vacio")
	private String threat;
	
	
	@NotBlank(message = "No debe estar vacio")
	private String controlMeasureReference;
	
	
	@NotBlank(message = "No debe estar vacio")
	private String controlMeasureDescription;
	
	@NotBlank(message = "No debe estar vacio")
	private String implatationResponsible;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expectedDate;
	
	public String getThreat() {
		return threat;
	}

	public void setThreat(String threat) {
		this.threat = threat;
	}

	public String getControlMeasureReference() {
		return controlMeasureReference;
	}

	public void setControlMeasureReference(String controlMeasureReference) {
		this.controlMeasureReference = controlMeasureReference;
	}

	public String getControlMeasureDescription() {
		return controlMeasureDescription;
	}

	public void setControlMeasureDescription(String controlMeasureDescription) {
		this.controlMeasureDescription = controlMeasureDescription;
	}

	public String getImplatationResponsible() {
		return implatationResponsible;
	}

	public void setImplatationResponsible(String implatationResponsible) {
		this.implatationResponsible = implatationResponsible;
	}

	public Date getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

	public String getActualState() {
		return actualState;
	}

	public void setActualState(String actualState) {
		this.actualState = actualState;
	}

	@NotBlank(message = "No debe estar vacio")
	private String actualState;
}
