package com.db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class Queries {

	public static Statement stm = null;

	public static boolean tbl_ifexists(Connection con){
		String if_lines = "SELECT * FROM lines;";
		String if_segs  = "SELECT * FROM segments;";
		String if_state = "SELECT * FROM stations;";

		try{
			stm = con.createStatement();
		
			stm.executeQuery(if_lines);
			stm.executeQuery(if_segs);
			stm.executeQuery(if_state);

			return true;

		}catch(SQLException e){

			return false;
		}
		

	}

	public static void create_base_tbls(Connection con){
		String line_creator = "CREATE TABLE lines"+
								"(line_id int, color VARCHAR(20), capacity int, segments int,"+ 
								"out_hour text, in_hour text);";

		String segs_creator = "CREATE TABLE segments"+
								"(seg_id int, name VARCHAR(20), longitud float, lines int);";

		String stations_cre = "CREATE TABLE stations" +
								"(stat_id int, name VARCHAR(30), zone VARCHAR(20));";

		try{
			stm = con.createStatement();
			
			stm.executeUpdate(line_creator);
			stm.executeUpdate(segs_creator);
			stm.executeUpdate(stations_cre);

			System.out.println("queries executed");

		}catch(SQLException e){
			e.printStackTrace();
			System.exit(0);
		}
		
								
	}
}