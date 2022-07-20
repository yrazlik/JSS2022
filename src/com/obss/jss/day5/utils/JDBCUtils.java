package com.obss.jss.day5.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {

    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_jss?useSSL=false";
    public static final String DB_USER = "dbuser";
    public static final String DB_PASSWORD = "dbuser123";

    public static Connection connectToDb() {
        try {
            System.out.println("Connecting to db...");
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection successfull...");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
