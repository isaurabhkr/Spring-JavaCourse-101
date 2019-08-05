package com.hsbc.models;
//jars reqd:
//derby.jar;
//derbyclient.jar
//derbynet.jar
//derbytools.jar
public class Student {
	private int rollNo;
	private String firstName;
	private String lastName;
	private double percent;
	public Student() {
	}
	public Student(int rollNo, String firstName, String lastName, double percent) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.percent = percent;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", percent="
				+ percent + "]";
	}
	//.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3.3..3.3.3.3.3.3.3.3.3.

	
}
