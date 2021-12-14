package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.util.Properties;

public class Conn {
	public static void main(){
		Connection c = null;

      	try{
         	String url = "jdbc:postgresql://localhost/postgres";
			Properties props = new Properties();
			props.setProperty("user","postgres");

			c = DriverManager.getConnection(url, props);

      	}catch (Exception e) {
         	e.printStackTrace();
         	System.err.println(e.getClass().getName()+": "+e.getMessage());
         	System.exit(0);
      	}

      	System.out.println("Opened database successfully");
	}
}