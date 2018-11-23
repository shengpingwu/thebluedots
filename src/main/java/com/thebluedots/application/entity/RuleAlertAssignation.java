package com.thebluedots.application.entity;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Rule_Alert_Assignation")
public class RuleAlertAssignation {

	private long alert_id;
	
	private long rule_id;
	
	private long magnitude_id;
	
	private Timestamp assignation_time;
	
	private long company_id;
	
}
