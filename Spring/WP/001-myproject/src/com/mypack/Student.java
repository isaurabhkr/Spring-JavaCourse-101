package com.mypack;

public class Student extends Person {
		public String courseName;
		public int yearOfPassing;
		
		public Student() {
			super();
		}

	public Student(int id, String firstName, String secondName, String courseName, int yearOfPassing) {
		super(id, firstName, secondName);
		// TODO Auto-generated constructor stub
		this.courseName = courseName;
		this.yearOfPassing = yearOfPassing;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	@Override
	public String toString() {
		return "Student [courseName=" + courseName + ", yearOfPassing=" + yearOfPassing + ", firstName=" + firstName
				+ ", secondName=" + secondName + ", id=" + id + "]";
	}
	

}