package com.hsbc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("a")
public class A {
	B b;
	@Value("100") int i;
	int s1;
	@Value("#${b.getString()}") String s;
	public A() {
		//super();
		System.out.println("A created using default constructor");
	}
	@Autowired
	public A(B b) {
		//super();
		System.out.println("A is created");
		this.b = b;
	}
	
	//@Autowired
	@Resource(name="d1")
	public void setD(D d) {
		System.out.println("SetD got D "+d);
	}
	//Resource works for methods and pins
	@PostConstruct
	public void init(){
		System.out.println("Init "+ this.i);
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Destroy");
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
		System.out.println("Inside set i of A");
	}
	public final void setS(int s) {
		this.s1= s;
		System.out.println("Inside set s of A");
	}
	
	
}