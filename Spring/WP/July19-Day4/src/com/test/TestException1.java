package com.test;
import java.io.IOException;
public class TestException1 {
	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int arr[]=new int[6];
		try {
		c=a/b;
		arr[5]=25;
		System.out.println("c :: "+c);
		}
		
		catch(ArithmeticException ex) {
			System.out.println("Cannot divide by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Checkk array index.");
		}
		finally {
			System.out.println("This will run for sure");
		}
		System.out.println("c :"+c);
	}

}
