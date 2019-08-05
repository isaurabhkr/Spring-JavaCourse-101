package com.hsbc.services;

import com.hsbc.models.Employees;

public interface EmployeeService {
	void create(Employees employee);
	Employees get(int EmployeeId);
}
