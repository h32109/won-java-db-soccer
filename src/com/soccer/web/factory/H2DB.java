package com.soccer.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.soccer.web.enums.DBDriver;
import com.soccer.web.enums.DBUrl;
import com.soccer.web.pool.Constants;

public class H2DB implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDriver.H2_DRIVER.toString());
			conn = DriverManager.getConnection(DBUrl.H2_URL.toString(), Constants.USERNAME, Constants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
