package com.thebluedots.application.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee_Group_Assignation")
public class EmployeeGroupAssignation {

	private long company_group_id;
	
	private long employee_id;
	
	private long company_id;
	
	private Timestamp assignation_time;
}
