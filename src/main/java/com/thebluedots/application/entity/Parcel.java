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
public class Parcel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8197569461475467504L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	
	private String name; 
	private String description;
	private String color;
	private Timestamp creation_time;
	private long company_id;
}