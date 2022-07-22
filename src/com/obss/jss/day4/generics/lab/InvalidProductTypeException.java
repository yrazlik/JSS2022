package com.obss.jss.day4.generics.lab;

public class InvalidProductTypeException extends Exception {

	private String errorMessage;
	
	public InvalidProductTypeException(String message) {
		this.errorMessage = message;
	}
}
