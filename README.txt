1) Import project as existing maven in eclipse
2) Run the file EmployeeportalApplication.java as Java Application
After server is started then try below Rest API

Below API testing

http://localhost:8080/api/employees

http://localhost:8080/api/employees?sortBy=salary

http://localhost:8080/api/employees?sortBy=salary&orderBy=desc

http://localhost:8080/api/employees?sortBy=name
http://localhost:8080/api/employees?sortBy=hireDate

http://localhost:8080/api/employees?sortBy=name&orderBy=desc
http://localhost:8080/api/employees?sortBy=hireDate&orderBy=desc