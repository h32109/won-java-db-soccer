package com.soccer.web.factory;

import com.soccer.web.enums.DB;

public class DatabaseFactory {
	public static Database createDatabase(String vendor) {
		 Database db = null;
			switch (DB.valueOf(vendor.toUpperCase())) {
		case ORACLE: db = new OracleDB();break;
		case MARIADB:db = new MariaDB(); break;
		case H2:db = new MariaDB(); break;
		case DB2:break;
		case MYSQL:break;
		default:break;
		}
		return db;}
	}

