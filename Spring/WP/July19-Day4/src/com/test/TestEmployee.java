package com.test;

import com.employee.Employee;
import com.exception.MaxLengthExceded;
import com.exception.MaxValueExcededException;
import com.exception.NegativeValueException;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		try {
		emp.setId(1);
		emp.setName("Modi");
		emp.setSalary(500000000);
		}
		catch(NegativeValueException ne) {
			System.out.println(ne);
		}catch(MaxLengthExceded max) {
			System.out.println(max);
		}
		catch(MaxValueExcededException max) {
			System.out.println(max);
		}
		finally {
			System.out.println(emp);
		}
	}

}
