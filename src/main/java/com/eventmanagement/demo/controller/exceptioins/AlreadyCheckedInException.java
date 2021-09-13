package com.eventmanagement.demo.controller.exceptioins;

public class AlreadyCheckedInException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public AlreadyCheckedInException() {
		super();
	}

	public AlreadyCheckedInException(String message) {
		super(message);
	}

	public AlreadyCheckedInException(String message, Throwable cause) {
		super(message, cause);
	}

	public AlreadyCheckedInException(Throwable cause) {
		super(cause);
	}

}
