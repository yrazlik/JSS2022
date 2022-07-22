package com.obss.jss.day5.lab;

public class ConnectionException extends Exception {

	private String message;

	public ConnectionException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
