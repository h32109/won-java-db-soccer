package com.soccer.web.daoimpls;

import com.soccer.web.dao.ScheduleDAO;

public class ScheduleDAOImpl implements ScheduleDAO {
	private static ScheduleDAOImpl instance = new ScheduleDAOImpl();

	public static ScheduleDAOImpl getInstance() {
		return instance;
	}
	
	

}
