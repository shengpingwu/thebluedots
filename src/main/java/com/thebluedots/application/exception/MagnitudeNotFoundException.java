package com.thebluedots.application.exception;

public class MagnitudeNotFoundException extends RuntimeException { 

	/**
	 * 
	 */
	private static final long serialVersionUID = 4509450793672217576L;

	public MagnitudeNotFoundException(Long id) {
		super("Magnitude with id " + id + " not found ");
	}
}
