package test;

import Stack.*;
public class testStack {

	public static void main(String[] args) {
		SafeStackImpl stack = new SafeStackImpl();
		int element =10;
		stack.printstack();
		while(!stack.isFull()) {
			stack.push(element);
			element+=10;
			stack.printstack();
		}
		
	System.out.println("..................");
	System.out.println("One pop");
		element = stack.pop();
		System.out.println(element+" ");
	stack.printstack();
	}
	
}


