package com.org.employee.portal.employeeportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.employee.portal.employeeportal.dao.EmployeeDAO;
import com.org.employee.portal.employeeportal.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDao) {
		this.employeeDao = theEmployeeDao;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return this.employeeDao.findAll();
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}
}
