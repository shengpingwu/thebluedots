package com.thebluedots.application.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Coordinate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8739905178825865871L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private double lat;
	private double lon;
	private double alt;
	private String name;
	private String description;
}