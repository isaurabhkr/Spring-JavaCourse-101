package com.stack;

public class Stack {
	private int data[]; //store stack data
	private int top; //maintain top of stack
	public static final int SIZE=6;
	public Stack()
	{
		data = new int[SIZE];
		for(int i=0;i<data.length;i++) 
			data[i]=-1;		
		top=-1;
		System.out.println(" Stack is Intiliatized :)");
	}
	
	public void push(int element) {
		if(!isFull()) {
		top+=1;
		data[top]=element;
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
		int topdata=data[top];
		data[top]=-1;
		top-=1;
		return topdata;
	}
		return -1;
	}
	
	public boolean isFull() {
		if(top== SIZE -1)
			return true;
		return false;
			
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	
	public int peek() {
		if(top==-1)
			return -1;
		return data[top];
	}

	
	public void printstack() {
		System.out.println("Contents of stack is");
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+"  ");
		}
		System.out.println("");

	}
}
