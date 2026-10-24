package com.example.employee_management.service;

import org.springframework.stereotype.Service;

import com.example.employee_management.entity.Employee;
import com.example.employee_management.repository.EmployeeRepository;
@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
	    this.employeeRepository = employeeRepository;
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);	
	}
}
