package com.thebluedots.application.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.thebluedots.application.model.AlertType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Alert implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2987284157798064569L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	
	// Clave externa de Company table.
	private long company_id;
	
	private String name; 
	
	private String description;
	private long notice_interval_ms;
	private AlertType type;
	private int active;
	private int inherited;
	private Timestamp creation_date;
}