package com.thebluedots.application.service;

import com.thebluedots.application.entity.Employee;

import java.util.List;

/**
 * CRUD service for employee class.
 */
public interface IEmployeeService {

    List<Employee> getAllEmployee();

    Employee getEmployeeById(Long id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    void deleteEmployeeById(Long id);

    Employee updateEmployee(Employee newEmployee, Long id);
}
