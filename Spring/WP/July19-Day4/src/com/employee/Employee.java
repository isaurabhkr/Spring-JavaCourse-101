package com.employee;

import com.exception.*;
public class Employee {
		private int id;
		private String name;
		private int salary;
		public Employee() {}
		public Employee(int id, String name, int salary) {
			//super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) throws NegativeValueException {
			if(id<0)
				throw new NegativeValueException(id);
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) throws MaxLengthExceded{
			if(name.length()>30)
				throw new MaxLengthExceded(name);
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) throws MaxValueExcededException {
			if(salary<0 || salary>99999)
				throw new MaxValueExcededException(salary);
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
}
