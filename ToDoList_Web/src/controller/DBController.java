package controller;

import java.sql.*;

public class DBController {
	
	private static final DBController dbcontroller = new DBController();
	private static Connection connection;
	private static final String DB_PATH = System.getProperty("user.home") + "/" + "toDoList_DB.db";
	
	static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.err.println("Fehler beim Laden des JDBC-Treibers");
            e.printStackTrace();
        }
	}
	
	
	private DBController(){
	    try {
	      Class.forName ( "org.sqlite.JDBC");
	      connection = DriverManager.getConnection ( "jdbc: sqlite: test.db");
	    } catch (Exception e) {
	    	 System.err.println (e.getClass().getName() + ":" + e.getMessage());
	      System.exit (0);
	    }
	    System.out.println ( "Geöffnete Datenbank erfolgreich");
    }
	

}
