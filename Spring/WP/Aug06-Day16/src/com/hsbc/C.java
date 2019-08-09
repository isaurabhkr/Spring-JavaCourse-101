package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class C {
	@Autowired D d;
	@Value("#(d.getStr()") String str;
	public C(D d) {
		//this.d = d;
		
		System.out.println("C is created " + this.str);
	}
	
	public String getStr()
	{
		return this.str;
		
	}
}
