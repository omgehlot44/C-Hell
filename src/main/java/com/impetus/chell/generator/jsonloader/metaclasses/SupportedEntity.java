package com.impetus.chell.generator.jsonloader.metaclasses;

import java.io.Serializable;

public class SupportedEntity implements Serializable{
	
	private String suboperation;
	
	private String boClass;
	
	private String dtoClass;

	private SupportedEntityProperties boProperties;

	private String returnToNext;

	public SupportedEntity(String boClass, String dtoClass, SupportedEntityProperties boProperties) {
		super();
		this.boClass = boClass;
		this.dtoClass = dtoClass;
		this.boProperties = boProperties;
	}

	public String getSuboperation() {
		return suboperation;
	}

	public void setSuboperation(String suboperation) {
		this.suboperation = suboperation;
	}

	public String getBoClass() {
		return boClass;
	}

	public void setBoClass(String boClass) {
		this.boClass = boClass;
	}

	public String getDtoClass() {
		return dtoClass;
	}

	public void setDtoClass(String dtoClass) {
		this.dtoClass = dtoClass;
	}

	public SupportedEntityProperties getBoProperties() {
		return boProperties;
	}

	public void setBoProperties(SupportedEntityProperties boProperties) {
		this.boProperties = boProperties;
	}
	
	public String getReturnToNext() {
		return returnToNext;
	}

	public void setReturnToNext(String returnToNext) {
		this.returnToNext = returnToNext;
	}

}
