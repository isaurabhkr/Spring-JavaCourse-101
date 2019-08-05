package com.exception;

public class StackisEmpty extends Exception {
	public StackisEmpty() {
		}
		@Override
		public String toString()
		{
			return "The stack is empty";
		}
}
