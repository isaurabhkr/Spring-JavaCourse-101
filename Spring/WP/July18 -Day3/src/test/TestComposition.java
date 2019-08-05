package test;

import day3pack.*;
public class TestComposition {
	
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Pune");
		address.setCountry("India");
		
		company company1 = new company();
		company1.setCompanyID(123);
		company1.setCompanyName("HSBC");
		company1.setAddress(address);
		System.out.println("company1 "+company1);
	}

}
