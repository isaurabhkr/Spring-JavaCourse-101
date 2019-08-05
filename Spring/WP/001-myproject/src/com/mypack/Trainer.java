package com.mypack;

public class Trainer implements Speaker {
	@Override
	public void speak()
	{
		System.out.println(" I am a patient soul");
		System.out.println("Default Duration::"+Speaker.DURATION+20+" mins");
		
}
}
