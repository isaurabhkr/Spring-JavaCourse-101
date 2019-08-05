package com.mypack;

public class Preacher implements Speaker {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(" I am a preaching soul");
		System.out.println("Default Duration::"+Speaker.DURATION+10+" mins");
		
	}

}
