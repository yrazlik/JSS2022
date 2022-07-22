package com.obss.jss.day5.lab;

public class QueryException extends Exception {

	private String message;

	public QueryException(String message) {
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
