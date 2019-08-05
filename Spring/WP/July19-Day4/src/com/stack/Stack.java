package com.stack;
import com.exception.*;
public class Stack {
	private int data[]; //store stack data
	private int top; //maintain top of stack
	public static final int SIZE=6;
	public Stack()
	{
		data = new int[SIZE+1];
		for(int i=0;i<SIZE;i++) 
			data[i]=-1;		
		top=-1;
		System.out.println(" Stack is Intiliatized :)");
	}
	
	public void push(int element) throws StackisFull {
		if(!isFull()) {
		top+=1;
		data[top]=element;
		}
	}
	
	public int pop() throws StackisEmpty {
		if(!isEmpty()) {
		int topdata=data[top];
		data[top]=-1;
		top-=1;
		return topdata;
	}
	return -1;
	}
	
	public boolean isFull() throws StackisFull {
		try {
		if(top== SIZE -1)
			throw new StackisFull();	
		} catch(StackisFull e)
		
		{
			System.out.println(e);
			return true;
		}
			return false;
	}
	
	public boolean isEmpty() throws StackisEmpty{
		try
        { 
		if(top==-1)
			throw new StackisEmpty();
        }catch(StackisEmpty e)
		{
        	System.out.println(e);
        	return true;
		}
			return false;
	}
	
	public int peek() {
		if(top==-1)
			return -1;
		return data[top];
	}

	
	public void printstack() {
		System.out.println("Contents of stack is");
		for(int i=0;i<SIZE;i++) {
			System.out.print(data[i]+"  ");
		}
		System.out.println("");

	}
}
