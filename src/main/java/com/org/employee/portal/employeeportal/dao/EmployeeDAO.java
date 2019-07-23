package com.org.employee.portal.employeeportal.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.org.employee.portal.employeeportal.entity.Employee;

@Component
public class EmployeeDAO {
	
	public static List<Employee> empList = new ArrayList<>();
	
	static {
		loadEmployees();
	}
	
	public static void loadEmployees() {

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
					
			Employee emp1 = new Employee(1, "mehul", "Sharma", formatter.parse("01-02-1989"),10000);
			Employee emp2 = new Employee(2, "sumit", "Sharma", formatter.parse("01-02-1988"),20000);
			Employee emp3 = new Employee(3, "arjun", "Sharma", formatter.parse("02-02-1989"),15000);
			Employee emp4 = new Employee(4, "rakesh", "Sharma", formatter.parse("01-02-1990"),22000);
			
			empList.add(emp1);
			empList.add(emp2);
			empList.add(emp3);
			empList.add(emp4);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public List<Employee> findAll() {
		return  empList;
	}
	
	
}
