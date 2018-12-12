package com.thebluedots.application.exception;

public class LanguageNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6645619094538958249L;

	public LanguageNotFoundException(Long id) {
		super("Language with id " + id + " not found ");
	}
}
