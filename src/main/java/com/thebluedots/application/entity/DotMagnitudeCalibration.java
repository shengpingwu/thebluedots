package com.thebluedots.application.entity;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Dot_Magnitude_Calibration")
public class DotMagnitudeCalibration {
	
	private long magnitude_id;
	
	private long calibrate_id;
	
	private long id; 
	
	private long position;
	
	private Timestamp calibration_time;
}
