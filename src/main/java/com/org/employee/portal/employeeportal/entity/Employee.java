package com.org.employee.portal.employeeportal.entity;

import java.util.Date;

public class Employee {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private Date hireDate;
	
	private Integer salary;
	
	public Employee() {
		
	}
	
	public Employee(int _id, String _firstName, String _lastName, Date _joinDate, Integer _salary) {
		this.id = _id;
		this.firstName = _firstName;
		this.lastName = _lastName;
		this.hireDate = _joinDate;
		this.salary = _salary;
	}

	public Integer getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getHireDate() {
		return hireDate;
	}
	
}
