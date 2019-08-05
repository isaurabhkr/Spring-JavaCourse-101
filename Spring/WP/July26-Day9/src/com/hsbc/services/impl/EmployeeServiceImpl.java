package com.hsbc.services.impl;

import com.hsbc.dao.impl.EmployeeDaoImpl;
import com.hsbc.daos.EmployeesDao;
import com.hsbc.models.Employees;
import com.hsbc.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeesDao employeeDao;
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoImpl();
	}
	@Override
	public void create(Employees employee) {
		// TODO Auto-generated method stub
		employeeDao.addEmployee(employee);
	}

	@Override
	public Employees get(int EmployeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(EmployeeId);
	}

}
