package com.thebluedots.application.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Parcel_Group_Assignation")
public class ParcelGroupAssignation {

	private long parcel_group_id;
	
	private long parcel_id; 
	
	private Timestamp assignation_time; 
	
	private long company_id;
}
