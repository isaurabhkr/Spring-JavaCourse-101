package com.test;

import com.queue.circularQueue;

public class testCircularQueue {

	public static void main(String[] args) {
		circularQueue cqueue = new circularQueue();
		int element =10;
		cqueue.printqueue();
		while(!cqueue.isFull()) {
			cqueue.insert(element);
			element+=10;
			cqueue.printqueue();
		}
		
		System.out.println("..................");
		element = cqueue.delete();
		System.out.println(element+" ");
		cqueue.printqueue();
		element = cqueue.delete();
		System.out.println(element+" ");
		cqueue.printqueue();
		element = cqueue.delete();
		System.out.println(element+" ");
		cqueue.printqueue();
		cqueue.insert(500);
		cqueue.printqueue();
	}

}
