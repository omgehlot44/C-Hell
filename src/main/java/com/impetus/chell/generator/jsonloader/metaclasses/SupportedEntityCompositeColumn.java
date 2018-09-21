package com.impetus.chell.generator.jsonloader.metaclasses;

import java.util.List;

public class SupportedEntityCompositeColumn extends SupportedEntityProperties{
	private List<String> compositeKey;
	private List<String> columns;
	
	public SupportedEntityCompositeColumn(boolean isCompositeKey, List<String> compositeKey, List<String> columns) {
		super.isCompositeKey = isCompositeKey;
		this.compositeKey = compositeKey;
		this.columns = columns;
	}

	public List<String> getCompositeKey() {
		return compositeKey;
	}

	public void setCompositeKey(List<String> compositeKey) {
		this.compositeKey = compositeKey;
	}

	public List<String> getColumns() {
		return columns;
	}

	public void setColumns(List<String> columns) {
		this.columns = columns;
	}
}
