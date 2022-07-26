package com.obss.jss.day5.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {

    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_jss?useSSL=false";
    public static final String DB_USER = "dbuser";
    public static final String DB_PASSWORD = "dbuser123";

    public static Connection connectToDb(boolean printLog) {
        return connect(JDBC_URL, DB_USER, DB_PASSWORD, printLog);
    }
    
    public static Connection connectToDb(String connectionUrl, String user, String password, boolean printLog) {
    	return connect(connectionUrl, user, password, printLog);
    }
    
    private static Connection connect(String connectionUrl, String user, String password, boolean printLog) {
        try {
        	printLog(printLog, "Connecting to db...");
            Connection conn = DriverManager.getConnection(connectionUrl, user, password);
            printLog(printLog, "Connection successfull...");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private static void printLog(boolean shouldPrint, String message) {
    	if(shouldPrint) {
    		System.out.println(message);
    	}
    }
}
