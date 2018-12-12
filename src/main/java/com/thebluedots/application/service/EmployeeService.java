package com.thebluedots.application.service;

import com.thebluedots.application.entity.Employee;
import com.thebluedots.application.exception.EmployeeNotFoundException;
import com.thebluedots.application.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private IEmployeeRepository employeeRepository;

    public EmployeeService() {

    }

    public List<Employee> getAllEmployee() {

        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {

        return employeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFoundException(id));
    }
    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(Employee newEmployee, Long id) {

        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setCompany_id(newEmployee.getCompany_id());
                    employee.setEmail(newEmployee.getEmail());
                    employee.setCreation_time(newEmployee.getCreation_time());
                    employee.setLanguague_id(newEmployee.getLanguague_id());
                    employee.setName(newEmployee.getName());
                    employee.setPassword(newEmployee.getPassword());
                    employee.setPhone(newEmployee.getPhone());
                    return employeeRepository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setEmployee_id(id);
                    return employeeRepository.save(newEmployee);
                });
    }
}
