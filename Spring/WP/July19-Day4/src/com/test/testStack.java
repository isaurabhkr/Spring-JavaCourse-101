package com.test;
import com.exception.StackisEmpty;
import com.exception.StackisFull;
import com.stack.*;
public class testStack {

	public static void main(String[] args) throws StackisFull,StackisEmpty {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		int element =10;
		stack.printstack();
		
		while(!stack.isFull()) {
			stack.push(element);
			element+=10;
			stack.printstack();
		}
	stack.push(element);
	stack.push(element);
	stack.push(element);
	stack.push(element);
//	System.out.println("..................");
	//while(!stack.isEmpty()) {
	//	element = stack.pop();
		//System.out.println(element+" ");
	}
	//element = stack.pop();
}
//}

