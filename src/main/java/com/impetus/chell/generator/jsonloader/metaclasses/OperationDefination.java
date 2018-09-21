package com.impetus.chell.generator.jsonloader.metaclasses;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class OperationDefination implements Serializable{
	
	private Map<String, SupportedEntity> operation= new HashMap<String, SupportedEntity> ();

	public OperationDefination(Map<String, SupportedEntity> operation) {
		super();
		this.operation = operation;
	}

	public Map<String, SupportedEntity> getOperation() {
		return operation;
	}

	public void setOperation(Map<String, SupportedEntity> operation) {
		this.operation = operation;
	}
	
}
