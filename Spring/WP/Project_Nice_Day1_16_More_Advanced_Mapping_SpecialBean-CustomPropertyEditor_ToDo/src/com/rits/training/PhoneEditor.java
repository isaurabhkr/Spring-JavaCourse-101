package com.rits.training;

import java.beans.PropertyEditorSupport;

public class PhoneEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		PhoneNumber phone = new PhoneNumber(areaCode,prefix, number);
		this.setValue(phone);
	}

		

}
