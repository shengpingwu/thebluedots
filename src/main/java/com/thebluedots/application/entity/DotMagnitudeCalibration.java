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
@Table(name="Dot_Magnitude_Calibration")
public class DotMagnitudeCalibration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private long magnitude_id;
	
	private long calibrate_id;
	
	private long position;
	
	private Timestamp calibration_time;
}
