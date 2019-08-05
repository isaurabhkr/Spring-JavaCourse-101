package com.test;
import java.util.Random;

import com.hsbc.cs45066188.Saurabh.*;
public class GreeterTest {

	public static void main(String[] args) {
		
		String Advise[]= {"Believeinyourself","Chillax,youaredoin'yourbest","Awakeatlast","Tryharder","Failureistemporary"};
		Greeter g1 = new Greeter("Mars");
		Greeter g2 = new Greeter("Venus");
		Advisor a1 = new Advisor(Advise);
		g1.sayHello();
		g2.sayHello();
		System.out.println(a1.getAdvise(a1));
		System.out.println(a1.getAdvise(a1));
		g2.sayBye();
		g1.sayBye();

	}

}
