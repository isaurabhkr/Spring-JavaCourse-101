package com.exception;

public class NegativeValueException extends Exception {
	private int value;

	public NegativeValueException(int value) {
		//super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "Exception || NegativeValueException [value=" + value + "]";
	}
	
}