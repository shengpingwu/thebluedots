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
public class Language implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6568936796752739309L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	
	private String shortLanguage;
	
	private String longLanguage;
	
	private Timestamp creation_time;
}
