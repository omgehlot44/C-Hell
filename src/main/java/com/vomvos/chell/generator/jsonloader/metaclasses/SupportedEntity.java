package com.vomvos.chell.generator.jsonloader.metaclasses;

import java.io.Serializable;

public class SupportedEntity implements Serializable{
	
	private String boClass;
	
	private String dtoClass;
	
	private SupportedEntityProperties boProperties;
	
	public SupportedEntity(String boClass, String dtoClass, SupportedEntityProperties boProperties) {
		super();
		this.boClass = boClass;
		this.dtoClass = dtoClass;
		this.boProperties = boProperties;
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
	
}
