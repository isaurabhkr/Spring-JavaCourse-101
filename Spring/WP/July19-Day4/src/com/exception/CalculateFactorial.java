package com.exception;
import com.exception.limits.*;
public class CalculateFactorial {
	/*public void factorial(int num) {
	public void factorial(int num)  throws ArithmeticException{
		int fact=1;
		/*try {
		if(num>6) {
			throw new ArithmeticException();
		}
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is" +fact);
		}catch(ArithmeticException a) {
			System.out.println("The value of num must be <=6");
		}
		if(num>6) {
			throw new ArithmeticException();
		}
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is" +fact);
		}
}*/

//normal way without throws
/*
public class CalculateFactorial {
	public void factorial(int num) {
		int fact=1;
	try {
		if(num>6) {
			throw new ArithmeticException();
		}
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is" +fact);
		}catch(ArithmeticException a) {
			System.out.println("The value of num must be <=6");
		}
		
	
		}
}*/


	//public void factorial(int num) {
	public void factorial(int num) throws MaxLimitExceeded,MinLimitExceeded
	{
		int fact=1;
		//try {
		if(num<=0) {
			throw new MinLimitExceeded(num);
		}
		else if(num>6)
		{
			throw new MaxLimitExceeded(num);
		}
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is" +fact);
		//}catch(ArithmeticException a) {
		//	System.out.println("The value of num must be <=6");
		}
		
	
}
//}