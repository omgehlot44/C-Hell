package com.impetus.chell.generator.jsonloader.metaclasses;

import java.io.Serializable;

public abstract class SupportedEntityProperties implements Serializable{
	
	protected boolean isCompositeKey;

	public boolean getIsCompositeKey() {
		return isCompositeKey;
	}

	public void setCompositeKey(boolean isCompositeKey) {
		this.isCompositeKey = isCompositeKey;
	}
	
}
