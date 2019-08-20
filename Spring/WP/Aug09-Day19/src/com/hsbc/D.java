package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class D {
	
	D()
	{
		System.out.println("D is created");
	}

}
