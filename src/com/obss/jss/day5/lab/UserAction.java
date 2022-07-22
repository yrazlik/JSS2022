package com.obss.jss.day5.lab;

public enum UserAction {

	INSERT("insert"),
	UPDATE("update"),
	DELETE("delete"),
	SEARCH("search"),
	EXIT("exit");
	
	private String action;
	
	UserAction(String action) {
		this.action = action;
	}
	
	public String getAction() {
		return action;
	}
	
	public static boolean isValidAction(String action) {
		for (UserAction act : UserAction.values()) { 
		    if(act.getAction().equalsIgnoreCase(action)) {
		    	return true;
		    }
		}
		return false;
	}
	
	public static UserAction fromAction(String action) {
		for (UserAction act : UserAction.values()) { 
		    if(act.getAction().equalsIgnoreCase(action)) {
		    	return act;
		    }
		}
		return null;
	}
}
