package com.grimaldi.sample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class ProductNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 2298968406973922541L;

	public ProductNotFoundException(String message) {
		super(message);
	}
}