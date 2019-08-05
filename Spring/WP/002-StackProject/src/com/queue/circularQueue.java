package com.queue;

public class circularQueue {
	private int data[];
	private int rear; 
	private int front;
	public static final int SIZE=6;
	public circularQueue()
	{
		data = new int[SIZE];
		for(int i=0;i<data.length;i++) 
			data[i]=-1;		
		rear=-1;
		front=-1;
		System.out.println(" Queue is Intiliatized :)");
	}
	public boolean isFull()
	{
		if((rear+1)%SIZE == front)
			return true;
		return false;
	}
	private boolean isEmpty()
	{
		if(front ==-1)
			return true;
		return false;
	}
	
	public void insert(int element)
	{
		if(!isFull()) 
		{
		if(isEmpty()) {
			front = 0;
			rear+=1;
			data[rear]=element;
		}
		rear+=1;
		rear=rear%SIZE;
		data[rear]=element;
	   }
	}
	
	public int delete()
	{
		if(isEmpty()) {
			return -1;
		}
		int datao = data[front];
		data[front]=-1;
		front+=1;
		front=front%SIZE;
		return datao;
	}
	
	public void printqueue()
	{
		System.out.println("Contents of queue is");
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+"  ");
		}
		System.out.println("");
	}
}
