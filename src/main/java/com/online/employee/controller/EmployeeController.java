package com.online.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.employee.entity.Employee;
import com.online.employee.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String homePage() {
		return "employee";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee() {
		return "addemployee";
	}
	
	@RequestMapping("/saveemployee")
	public String saveEmployee(@ModelAttribute Employee employee,Model model) {
		employeeService.addEmployee(employee);
		
		List<Employee> listOfEmployee= new ArrayList();

		listOfEmployee.add(employee);
		model.addAttribute("listOfEmployee", listOfEmployee);
		return "redirect:/employee/getEmployee";
	}
	
	@RequestMapping("/getEmployee")
	public String getEmployee(Model model) {
		List<Employee> listOfEmployee=employeeService.getEmployee();
		model.addAttribute("listOfEmployee", listOfEmployee);
		return "employee";
	}

}
