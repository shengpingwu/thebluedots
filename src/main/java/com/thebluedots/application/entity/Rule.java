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


@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6754320178099929511L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private long magnitude_id;
	
	private long company_id;
	
	private String name;
	
	private String description;
	
	private String bool_expresion;
	
	private Timestamp creation_time;
}