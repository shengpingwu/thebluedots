package com.thebluedots.application.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Alert_Parcel_Assignation")
public class AlertParcelAssignation {
	
	private long parcel_id;
	
	private long alert_id;
	
	private Timestamp assignation_time;
	
	private long company_id;
}
