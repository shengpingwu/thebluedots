package com.thebluedots.application.exception;

public class EmployeeNotFoundException extends RuntimeException{


	/**
	 * 
	 */
	private static final long serialVersionUID = -5910637540099388573L;

	public EmployeeNotFoundException(Long id) {
		super("Employee with id " + id + " not found ");
	}
}
