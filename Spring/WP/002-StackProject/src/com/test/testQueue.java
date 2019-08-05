package com.test;

import com.queue.Queue;

public class testQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		int element =10;
		queue.printqueue();
		while(!queue.isFull()) {
			queue.insert(element);
			element+=10;
			queue.printqueue();
		}
		
		System.out.println("..................");
		element = queue.delete();
		System.out.println(element+" ");
		queue.printqueue();
	
	}

}
