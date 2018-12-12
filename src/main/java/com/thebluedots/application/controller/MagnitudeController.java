package com.thebluedots.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thebluedots.application.entity.Magnitude;
import com.thebluedots.application.exception.MagnitudeNotFoundException;
import com.thebluedots.application.repository.IMagnitudeRepository;


@RestController
@RequestMapping("/v1")
public class MagnitudeController {
	
	private IMagnitudeRepository magnitudeRepository;
	
	@Autowired
	public MagnitudeController(IMagnitudeRepository magnitudeRepository) {
		this.magnitudeRepository = magnitudeRepository;
	}
	
	@GetMapping("/magnitude")
	public List<Magnitude>  getAllMagnitude() {
		
		return magnitudeRepository.findAll();
	}
	
	@GetMapping("/magnitude/{id}")
	public Magnitude getMagnitudeById(@PathVariable Long id) {
		
		return magnitudeRepository.findById(id).orElseThrow(()-> new MagnitudeNotFoundException(id));
	}
	
	@PostMapping("/magnitude")
	public Magnitude saveAnMagnitude(@RequestBody Magnitude magnitude) {
		
		return magnitudeRepository.save(magnitude);
	}
	
	@DeleteMapping("/magnitude/{id}")
	public void deleteMagnitude(@PathVariable Long id) {
		
		magnitudeRepository.deleteById(id);
	}
}
