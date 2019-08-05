package com.test;
import java.util.Scanner;
import com.mypack.Student;

public class TestStudent {

	private static java.util.Scanner scanner;
	public void sortstudentsAsc(Student[] students) {
		for(int i=0;i<students.length;i++)
		{
			for(int j=0;j<(students.length-i-1);j++)
			{
				if(students[j].id>students[j+1].id)
				{
					Student temp = new Student();
					temp = students[j];
					students[j]=students[j+1];
					students[j+1]=temp;
				}
			}
		}
		printStudents(students);
	}
	public void printStudents(Student[] students){
		System.out.println("Sorted Aray");
		for(int i =0;i<students.length;i++)
		{
			System.out.println("Id:"+students[i].id);
			System.out.println("firstName:"+students[i].firstName);
			System.out.println("lastName:"+students[i].secondName);
			System.out.println("courseName:"+students[i].courseName);
			System.out.println("year of passing:"+students[i].yearOfPassing);
		}
	}

	public static void main(String[] args) {
		scanner = new java.util.Scanner(System.in);
		Student students[]=new Student[5];
		for(int i =0;i<students.length;i++)
		{
			System.out.println("Enter id:");
			int id = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter firstName:");
			String firstName = scanner.nextLine();
			System.out.println("Enter lastName:");
			String lastName = scanner.nextLine();
			System.out.println("Enter the course Name:");
			String courseName = scanner.nextLine();
			System.out.println("Enter the year of passing:");
			int year = Integer.parseInt(scanner.nextLine());
			students[i] = new Student(id,firstName,lastName,courseName,year);
		}
		
		

	}

}
