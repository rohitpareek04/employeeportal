package com.org.employee.portal.employeeportal.services;

import java.util.List;

import com.org.employee.portal.employeeportal.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	
}
