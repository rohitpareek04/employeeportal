package com.org.employee.portal.employeeportal.rest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.employee.portal.employeeportal.entity.Employee;
import com.org.employee.portal.employeeportal.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService) {
		this.employeeService = theEmployeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(@RequestParam(name="sortBy",required=false) String _sortBy,
			@RequestParam(name="orderBy",required=false,defaultValue="asc") String _orderBy) {
		
		List<Employee> employeeList = this.findAllById(_orderBy);

		if (_sortBy == null) {
			return employeeList;
		}
		
		switch (_sortBy) {
			
			case "salary": employeeList = this.findAllBySalary(_orderBy);
						break;
			case "name": employeeList = this.findAllByName(_orderBy);
						break;
			case "hireDate": employeeList = this.findAllByHireDate(_orderBy);
						break;
		}
		
		return employeeList;
	}
	
	public List<Employee> findAllById(String _orderBy) {
		
		List<Employee> employeeList = this.employeeService.findAll();
		
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				if (_orderBy.equals("asc"))
					return ((emp1.getId() > emp2.getId()) ? 1 : -1);
				else 
					return ((emp1.getId() > emp2.getId()) ? -1 : 1);
			}
			
		});
		
		return employeeList;
	}
	

	public List<Employee> findAllBySalary(String _orderBy) {
		
		List<Employee> employeeList = this.employeeService.findAll();
		
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				if (_orderBy.equals("desc"))
					return -1 * emp1.getSalary().compareTo(emp2.getSalary());
				else
					return emp1.getSalary().compareTo(emp2.getSalary());
			}
			
		});
		
		return employeeList;
	}
	
	public List<Employee> findAllByName(String _orderBy) {
		
		List<Employee> employeeList = this.employeeService.findAll();
		
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				if (_orderBy.equals("desc"))
					return -1 * emp1.getFirstName().compareTo(emp2.getFirstName());
				else
					return emp1.getFirstName().compareTo(emp2.getFirstName());
			}
			
		});
		
		return employeeList;
	}
	
	public List<Employee> findAllByHireDate(String _orderBy) {
		
		List<Employee> employeeList = this.employeeService.findAll();
		
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				if (_orderBy.equals("desc"))
					return -1 * emp1.getHireDate().compareTo(emp2.getHireDate());
				else
					return emp1.getHireDate().compareTo(emp2.getHireDate());
			}
			
		});
		
		return employeeList;
	}
}
