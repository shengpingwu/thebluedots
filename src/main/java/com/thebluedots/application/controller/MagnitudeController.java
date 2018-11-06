package com.thebluedots.application.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.thebluedots.application.entity.Magnitude;
import com.thebluedots.application.model.MagnitudeType;
import com.thebluedots.application.repository.MagnitudeRepository;


@Controller
public class MagnitudeController {
	
	private MagnitudeRepository magnitudeRepository;
	
	@Autowired
	public MagnitudeController(MagnitudeRepository magnitudeRepository) {
		this.magnitudeRepository = magnitudeRepository;
	}
	
	@GetMapping("/magnitude")
	public Magnitude saveAnMagnitude() {
		Magnitude magnitude = Magnitude.builder()
				.name("Magnitude1")
				.description("Una magnitud de example")
				.decimals(1)
				.max_value("")
				.min_value("")
				.type(MagnitudeType.NUMBER)
				.creation_time(new Timestamp(System.currentTimeMillis()))
				.build();
		
		magnitudeRepository.save(magnitude);
		
		return magnitude;
	}
}
