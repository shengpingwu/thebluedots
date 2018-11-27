package com.thebluedots.application.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2603064327708968921L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long employee_id;
	
	private long company_id;
	
	private String email;
	
	private String password;
	
	private String name;
	
	private String phone;
	
	private Timestamp creation_time;
	
	private long languague_id;
}