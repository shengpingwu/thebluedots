package com.thebluedots.application.controller;

import java.util.List;

import com.thebluedots.application.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thebluedots.application.entity.Employee;

@RestController
@RequestMapping("/apiV1")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		
		return employeeService.getAllEmployee();
	}
	
	@PostMapping("/employee")
	public Employee setEmployee(@RequestBody Employee newEmployee) {
		
		return employeeService.saveEmployee(newEmployee);
	}
	
	@GetMapping("/employee/{id}") 
	public Employee getEmployeeById(@PathVariable Long id) {
		
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/employee/{id}")
	public Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
		
		return employeeService.updateEmployee(newEmployee, id);

	}
	
	@DeleteMapping("/employee/{id}") 
	public void deleteEmployeeById(@PathVariable Long id){

		employeeService.deleteEmployeeById(id);
	}
	

}
