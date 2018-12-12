package com.thebluedots.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thebluedots.application.entity.Language;
import com.thebluedots.application.exception.LanguageNotFoundException;
import com.thebluedots.application.repository.ILanguageRepository;

@RestController
@RequestMapping("/v1")
public class LanguageController {

	private ILanguageRepository languageRepository;
	
	@Autowired
	public LanguageController(ILanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	@GetMapping("/language")
	public List<Language> getAllLanguage() {
		
		return languageRepository.findAll();
	}
	
	@GetMapping("/language/{id}")
	public Language getLanguageById(@PathVariable Long id) {
		
		return languageRepository.findById(id).orElseThrow(()-> new LanguageNotFoundException(id));
	}
	
	@PostMapping("/language")
	public Language setLanguage(@RequestBody Language lang) {
		
		return languageRepository.save(lang);
	}
	
	@PutMapping("/language/{id}") 
	public Language modifierLanguage(@RequestBody Language lang, @PathVariable Long id) {
		
		return languageRepository.findById(id)
			.map(language -> {
				lang.setCreation_time(language.getCreation_time());
				lang.setLongLanguage(language.getLongLanguage());
				lang.setShortLanguage(language.getShortLanguage());
				return languageRepository.save(lang); 
			})
			.orElseGet(() -> {
				lang.setId(id);
				return languageRepository.save(lang);
			});
	}
	
	
	@DeleteMapping("/language/{id}")
	public void deleteLanguage(@PathVariable Long id) {
		
		languageRepository.deleteById(id);
	}
	
}
