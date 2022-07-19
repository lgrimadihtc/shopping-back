package com.grimaldi.sample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)

public class NotAllowedFileTypeException extends RuntimeException {
	
	private static final long serialVersionUID = 2298968406973922541L;

	public NotAllowedFileTypeException(String message) {
		super(message);
	}
}