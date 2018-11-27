package com.thebluedots.application.entity;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.thebluedots.application.entity.Calibration.CalibrationBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employee_Role_Company_Assignation")
public class EmployeeRoleCompanyAssignation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private long employee_id;
	
	private long role_id;
	
	private Timestamp assignation_time; 
	
	private long company_id;
}
