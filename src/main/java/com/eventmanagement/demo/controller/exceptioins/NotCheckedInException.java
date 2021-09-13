package com.eventmanagement.demo.controller.exceptioins;

public class NotCheckedInException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotCheckedInException() {
		super();
	}

	public NotCheckedInException(String message) {
		super(message);
	}

	public NotCheckedInException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotCheckedInException(Throwable cause) {
		super(cause);
	}

}
