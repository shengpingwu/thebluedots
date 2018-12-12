package com.thebluedots.application.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.thebluedots.application.exception.LanguageNotFoundException;

@ControllerAdvice
public class LanguageNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(LanguageNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String languageNotFoundHandler(LanguageNotFoundException ex) {
		return ex.getMessage();
	}
}
