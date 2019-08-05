package com.exception;

public class StackisFull extends Exception {
	public StackisFull() {
		}
		@Override
		public String toString()
		{
			return "The stack is full";
		}
}
