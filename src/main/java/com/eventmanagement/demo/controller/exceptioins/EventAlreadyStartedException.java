package com.eventmanagement.demo.controller.exceptioins;

public class EventAlreadyStartedException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public EventAlreadyStartedException() {
		super();
	}

	public EventAlreadyStartedException(String message) {
		super(message);
	}

	public EventAlreadyStartedException(String message, Throwable cause) {
		super(message, cause);
	}

	public EventAlreadyStartedException(Throwable cause) {
		super(cause);
	}

}
