package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {
	D d;
	//@Autowired
	public C() {
		super();
		System.out.println("C is created");

		this.d = d;
	}
	

}
