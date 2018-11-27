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
public class Company implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4890283075632539787L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name; 
	private String web;
	private String direction;
	private String email;
	private Timestamp creation_time;
	
	// Clave externa a la tabla de language
	private long language_id;
}
