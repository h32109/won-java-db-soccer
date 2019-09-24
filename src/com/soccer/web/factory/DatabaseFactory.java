package com.soccer.web.factory;


public class DatabaseFactory {
	public static Database createDatabase(String vendor) {
		 Database db = null;
			switch (vendor) {
		case "oracle": db = new OracleDB();break;
		case "mariadb":db = new MariaDB(); break;
		case "h2":db = new MariaDB(); break;
		case "db2":break;
		case "mysql":break;
		default:break;
		}
		return db;}
	}

