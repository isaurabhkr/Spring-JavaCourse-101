package com.exception.limits;

public class MaxLimitExceeded extends Exception {

	private int details;
	

	public MaxLimitExceeded(int details) {
	this.details=details;
	}
	@Override
	public String toString()
	{
		return "Exception: max limit exceeded";
	}

	

}
