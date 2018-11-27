package com.thebluedots.application.controller;

import java.util.List;

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
import com.thebluedots.application.exception.EmployeeNotFoundException;
import com.thebluedots.application.repository.IEmployeeRepository;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

	private IEmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeController(IEmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		
		return employeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFoundException(id));
	}
	
	@PostMapping("/employee")
	public Employee setEmployee(@RequestBody Employee lang) {
		
		return employeeRepository.save(lang);
	}
	
	@PutMapping("/employee/{id}") 
	public Employee modifierEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		
		return employeeRepository.findById(id)
			.map(empl -> {
				employee.setCompany_id(empl.getCompany_id());
				employee.setCreation_time(empl.getCreation_time());
				employee.setEmail(empl.getEmail());
				employee.setName(empl.getName());
				employee.setPassword(empl.getPassword());
				employee.setPhone(empl.getPhone());
				return employeeRepository.save(employee); 
			})
			.orElseGet(() -> {
				employee.setEmployee_id(id);
				return employeeRepository.save(employee);
			});
	}
	
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		
		employeeRepository.deleteById(id);
	}
	
}
