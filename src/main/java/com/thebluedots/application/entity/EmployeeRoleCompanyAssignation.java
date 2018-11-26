package com.thebluedots.application.entity;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee_Role_Company_Assignation")
public class EmployeeRoleCompanyAssignation {

	private long employee_id;
	
	private long role_id;
	
	private Timestamp assignation_time; 
	
	private long company_id;
}
