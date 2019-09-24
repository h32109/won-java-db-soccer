package com.soccer.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.soccer.web.pool.Constants;

public class H2DB implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(Constants.H2_DRIVER);
			conn = DriverManager.getConnection(Constants.H2_URL, Constants.USERNAME, Constants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
