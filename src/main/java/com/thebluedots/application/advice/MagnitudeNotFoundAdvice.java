package com.thebluedots.application.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.thebluedots.application.exception.MagnitudeNotFoundException;

@ControllerAdvice
public class MagnitudeNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(MagnitudeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String magnitudeNotFoundHandler(MagnitudeNotFoundException ex) {
		return ex.getMessage();
	}
}
