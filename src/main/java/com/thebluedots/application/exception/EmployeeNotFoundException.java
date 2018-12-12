package com.thebluedots.application.exception;

public class EmployeeNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8710549268908862143L;

	public EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}

}
