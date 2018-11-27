package com.thebluedots.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thebluedots.application.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long>{

}
