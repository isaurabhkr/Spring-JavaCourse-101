package com.exception;

public class MaxValueExcededException extends Exception{
	private int value;

	public MaxValueExcededException(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "MaxValueExcededException [value=" + value + "]";
	}
	

}
