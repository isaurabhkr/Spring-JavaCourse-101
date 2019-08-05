package com.mypack;

public class Politician implements Speaker {

	@Override
	public void speak() {
		System.out.println(" I am a lost soul!");
		System.out.println("Default Duration::"+Speaker.DURATION+" mins");
	}
	

}
