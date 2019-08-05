package com.test;
import com.exception.CalculateFactorial;
import com.exception.limits.*;
public class TestFactorial {

	/*public static void main(String[] args) {
		CalculateFactorial f = new CalculateFactorial();
		f.factorial(3);
		f.factorial(7);
		
	}*/
	public static void main(String[] args) {
		CalculateFactorial f = new CalculateFactorial();
		try {
		f.factorial(3);
		//f.factorial(7);
		f.factorial(-2);
		}catch(MinLimitExceeded e) {
			System.out.println(e);
			e.printStackTrace();
		}
		catch(MaxLimitExceeded e) {
			System.out.println(e);
			
		}

	}

}

