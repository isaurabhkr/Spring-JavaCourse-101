package com.hsbc.cs45066188.Saurabh;
import java.util.Random;

public class Advisor {
	String[] message=new String[5];

	public Advisor(String[] message) {
		this.message = message;
	}
	public static int getRandomIntegerBetweenRange(double min, double max){
	    int x = (int) ((int)(Math.random()*((max-min)+1))+min);
	    return x;
	}
	public String getAdvise(Advisor ob)
	{
		Random r = new Random();
		int index=getRandomIntegerBetweenRange(0,5);
		return ob.message[index];
	}
}
