package com.test;

import com.mypack.*;
public class TestInterfaces {

	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Politician politician = new Politician();
		Preacher preacher = new Preacher();
		displayInfo(trainer);
		displayInfo(politician);
		displayInfo(preacher);
	}
	static void displayInfo(Speaker speaker)
	{
		speaker.speak();
	}
}
