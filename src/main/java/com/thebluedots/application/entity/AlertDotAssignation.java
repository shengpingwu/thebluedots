package com.thebluedots.application.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Alert_Dot_Assignation")
public class AlertDotAssignation {

	private long alert_id;
	
	private long dot_id;
	
	private Timestamp assignation_time;
	
	private long company_id;
}
