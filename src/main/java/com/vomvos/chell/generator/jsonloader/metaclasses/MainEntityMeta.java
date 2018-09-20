package com.vomvos.chell.generator.jsonloader.metaclasses;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainEntityMeta implements Serializable{
	
	private String uid;
	
	private List<String> operationDeclarations;
	
	private Map<String, OperationDefination> operationDefinations= new HashMap<String, OperationDefination> ();

	public MainEntityMeta(String uid, List<String> operationDeclarations,
			Map<String, OperationDefination> operationDefinations) {
		this.uid = uid;
		this.operationDeclarations = operationDeclarations;
		this.operationDefinations = operationDefinations;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public List<String> getOperationDeclarations() {
		return operationDeclarations;
	}

	public void setOperationDeclarations(List<String> operationDeclarations) {
		this.operationDeclarations = operationDeclarations;
	}

	public Map<String, OperationDefination> getOperationDefinations() {
		return operationDefinations;
	}

	public void setOperationDefinations(Map<String, OperationDefination> operationDefinations) {
		this.operationDefinations = operationDefinations;
	}
	
	
}
