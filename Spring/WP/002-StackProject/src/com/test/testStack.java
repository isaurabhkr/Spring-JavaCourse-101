package com.test;
import com.stack.*;
public class testStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		int element =10;
		stack.printstack();
		
		while(!stack.isFull()) {
			stack.push(element);
			element+=10;
			stack.printstack();
		}
	
	System.out.println("..................");
	while(!stack.isEmpty()) {
		element = stack.pop();
		System.out.println(element+" ");
	}
}
}
