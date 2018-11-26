package com.thebluedots.application.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Parcel_Coordinate")
public class ParcelCoordinate {

	private long coordinate_id;
	
	private long parcel_id;
	
	private long order_position;
	
	private Timestamp assignation_time;
	
}
