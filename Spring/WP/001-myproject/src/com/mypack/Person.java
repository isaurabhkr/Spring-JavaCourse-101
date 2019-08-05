package com.mypack;

public class Person {
	//VARIABLE INITIALIZERS	
	public String firstName="N/A";
	public String secondName="N/A";
	public int id=-1;
	
	//Constructors and Varible initializers go hand in hand
	public Person() {
		this.firstName="Not A";
		this.secondName="Not A";
		this.id=100;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", secondName=" + secondName + ", id=" + id + "]";
	}
	//customized constructor gets more priority than default class
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param id
	 * @param firstName
	 * @param secondName
	 */
	public Person(int id, String firstName, String secondName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
	}

}

