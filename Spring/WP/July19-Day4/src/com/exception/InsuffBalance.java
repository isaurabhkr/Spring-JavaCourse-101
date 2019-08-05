package com.exception;

public class InsuffBalance extends Exception {
	/*private int minimumBalance;
	public void Balance()
	{
		this.minimumBalance=minimumBalance;
	}*/
	@Override
	public String toString()
	{
		return "Insufficient Balance";
	}
}
