package com.db;

import java.sql.Statement;

public class Queries {
	public static void create_base_tbls(){
		String line_creator = "CREATE TABLE lines"+
								"(line_id int, color VARCHAR(20), capacity int, segments int,"+ 
								"out_hour text, in_hour text);";

		String segs_creator = "CREATE TABLE segments"+
								"(seg_id int, name VARCHAR(20), longitud float, lines int);";
								
		String stations_cre = "CREATE TABLE stations" +
								"(stat_id int, name VARCHAR(30), zone VARCHAR(20));";
								
	}
}