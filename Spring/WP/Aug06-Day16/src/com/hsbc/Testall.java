package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testall {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext();
		A a = (A) ctx.getBean(A.class);
		a.getI();
;		((AbstractApplicationContext) ctx).close();
	}

}
