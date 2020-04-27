package com.example.projectweb.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object valor) {
		super("Resource not found. Valor " + valor);
		
	}
}
