package com.hsbc.daos;

import com.hsbc.models.Employees;

public interface EmployeesDao {
	void createConnection();
	void addEmployee(Employees employee);
	Employees getEmployee(int employeeId);
	void closeConnection();
}