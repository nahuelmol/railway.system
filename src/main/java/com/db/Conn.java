package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

import java.util.Properties;

import com.db.Queries;

public class Conn {
	public static void main(){
		Connection c = null;

      	try{
         	String url = "jdbc:postgresql://localhost:5432/postgres";
			   Properties props = new Properties();
			   props.setProperty("user","postgres");

			   c = DriverManager.getConnection(url, props);

            if(Queries.tbl_ifexists(c)){
               System.out.println("Tables already exist!\n");
            }else{
               Queries.create_base_tbls(c);
            }

      	}catch (SQLException e) {
         	e.printStackTrace();
         	System.err.println(e.getClass().getName()+": "+e.getMessage());
         	System.exit(0);
      	}

      	System.out.println("Opened database successfully");
	}
}