package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		A a = (A) ctx.getBean("a");
		System.out.println(a.getClass().getName());
		a.setI(2000);
		a.setS(10);
		System.out.println("***************");
		B b = (B) ctx.getBean("b");
		System.out.println(b.getClass().getName());
		b.setString("hello");

	}

}
