package com.example.employee_management.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.employee_management.entity.Employee;
import com.example.employee_management.service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService) {
	    this.employeeService = employeeService;
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
		
	}
}
