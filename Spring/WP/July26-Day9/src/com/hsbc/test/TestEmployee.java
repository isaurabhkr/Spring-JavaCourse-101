package com.hsbc.test;

import com.hsbc.models.Employees;
import com.hsbc.services.EmployeeService;
import com.hsbc.services.impl.EmployeeServiceImpl;

public class TestEmployee {
		public static void main(String[] args) {
			EmployeeService employeeService = new EmployeeServiceImpl();
			employeeService.create(new Employees(1,"Narendra","Ahmedabad",50000,975984754,01));
			employeeService.create(new Employees(2,"Sarfaraj","Karanchi",50000,975984754,02));
			employeeService.create(new Employees(3,"Imran","Islamabad",50000,975984754,03));
			employeeService.create(new Employees(4,"Donald","Washington",50000,975984754,04));
			
			System.out.println(employeeService.get(1));
			System.out.println(employeeService.get(2));
			System.out.println(employeeService.get(3));
			System.out.println(employeeService.get(4));
		}
	}
