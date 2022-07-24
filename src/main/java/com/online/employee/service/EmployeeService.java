package com.online.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.employee.DAO.EmployeeRepository;
import com.online.employee.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void addEmployee( Employee employee) {
		//write your own logic 
		employeeRepository.addEmployee(employee);
	}
	
	public List<Employee>  getEmployee() {
		//write your own logic 
		List<Employee> EmployeeResult = employeeRepository.getEmployee();
		return EmployeeResult;
	}

}
