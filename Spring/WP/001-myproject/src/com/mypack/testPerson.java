package com.mypack;

public class testPerson {
	public static void main(String[] args) {
		Person person= new Person();
		
		/*System.out.println("FirstNAme : "+person.getFirstName());
		System.out.println("SecondNAme : "+person.getSecondName());
		System.out.println("ID : "+person.getId());*/
		//Constructors and Variable initializers go hand in hand
		/*FirstNAme : Not A
		SecondNAme : Not A
		ID : 100
		*/
		Person person12= new Person(1,"Narendra","Modi");
		
		System.out.println("FirstNAme : "+person12.getFirstName());
		System.out.println("SecondNAme : "+person12.getSecondName());
		System.out.println("ID : "+person12.getId());
		//It is a good practice to write implicit function calls for better debugging.
		System.out.println(person12);
		System.out.println(person12.toString());
		/*FirstNAme : Narendra
		SecondNAme : Modi
		ID : 1*/
	}
}
