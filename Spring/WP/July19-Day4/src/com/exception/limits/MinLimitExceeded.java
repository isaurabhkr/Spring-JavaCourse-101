package com.exception.limits;

public class MinLimitExceeded extends Exception {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int details;
	public MinLimitExceeded(int details) {
	this.details=details;
	}
	@Override
	public String toString()
	{
		return "Exception: min limit exceeded";
	}

}
