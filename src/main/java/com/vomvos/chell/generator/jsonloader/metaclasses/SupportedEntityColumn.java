package com.vomvos.chell.generator.jsonloader.metaclasses;

import java.util.List;

public class SupportedEntityColumn extends SupportedEntityProperties{
	private List<String> columns;
	
	public SupportedEntityColumn(boolean isCompositeKey, List<String> columns) {
		super.isCompositeKey = isCompositeKey;
		this.columns = columns;
	}

	public List<String> getColumns() {
		return columns;
	}

	public void setColumns(List<String> columns) {
		this.columns = columns;
	}
	
}
