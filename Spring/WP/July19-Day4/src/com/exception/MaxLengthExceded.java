package com.exception;

public class MaxLengthExceded extends Exception {
	private String value;

	public MaxLengthExceded(String value) {
		//super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "MaxLengthExceded [value=" + value + "]";
	}
	

}
