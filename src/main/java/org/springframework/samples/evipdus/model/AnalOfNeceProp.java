package org.springframework.samples.evipdus.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "analOfNeceProp")
public class AnalOfNeceProp extends BaseEntity{

	
	private String legitimation;
	
	private String ljustification;
	
	private boolean needEv0;
	private String needEv0J;
	
	private boolean needEv1;
	private String needEv1J;
	
	private boolean needEv2;
	private String needEv2J;
	
	private boolean needEv3;
	private String needEv3J;
	
	private boolean conclusion;

	public String getLegitimation() {
		return legitimation;
	}

	public void setLegitimation(String legitimation) {
		this.legitimation = legitimation;
	}

	public String getLjustification() {
		return ljustification;
	}

	public void setLjustification(String ljustification) {
		this.ljustification = ljustification;
	}

	public boolean isNeedEv0() {
		return needEv0;
	}

	public void setNeedEv0(boolean needEv0) {
		this.needEv0 = needEv0;
	}

	public String getNeedEv0J() {
		return needEv0J;
	}

	public void setNeedEv0J(String needEv0J) {
		this.needEv0J = needEv0J;
	}

	public boolean isNeedEv1() {
		return needEv1;
	}

	public void setNeedEv1(boolean needEv1) {
		this.needEv1 = needEv1;
	}

	public String getNeedEv1J() {
		return needEv1J;
	}

	public void setNeedEv1J(String needEv1J) {
		this.needEv1J = needEv1J;
	}

	public boolean isNeedEv2() {
		return needEv2;
	}

	public void setNeedEv2(boolean needEv2) {
		this.needEv2 = needEv2;
	}

	public String getNeedEv2J() {
		return needEv2J;
	}

	public void setNeedEv2J(String needEv2J) {
		this.needEv2J = needEv2J;
	}

	public boolean isNeedEv3() {
		return needEv3;
	}

	public void setNeedEv3(boolean needEv3) {
		this.needEv3 = needEv3;
	}

	public String getNeedEv3J() {
		return needEv3J;
	}

	public void setNeedEv3J(String needEv3J) {
		this.needEv3J = needEv3J;
	}

	public boolean isConclusion() {
		return conclusion;
	}

	public void setConclusion(boolean conclusion) {
		this.conclusion = conclusion;
	}
	
}
