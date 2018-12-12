package com.thebluedots.application.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.thebluedots.application.model.MagnitudeType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Magnitude implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9196381763870976761L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name; 
	
	private String description; 
	
	private Integer decimals; 
	
	private MagnitudeType type; 
	
	private String min_value; 
	
	private String max_value; 
	
	private Timestamp creation_time; 
	
}