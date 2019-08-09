package com.hsbc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages ="app" )
@Component("a")
public class A {
	B b;
	C c;
	@Value("100") int i;
	@Value("#(c.getStr()") String s;
	int j;
	@Autowired
	public A(B b) {
		this.b = b;
		System.out.println("A is created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy called");
	}

	public int getI() {
		System.out.println("i = "+i);
		return i;
	}

	
	@Autowired
	public void setAll(B b, @Value("20") int j) {
		this.b = b;
		i = 200;
	}

}
