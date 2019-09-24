package com.soccer.web.daoimpls;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.dao.PlayerDAO;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDAOImpl implements PlayerDAO {
	private static PlayerDAOImpl instance = new PlayerDAOImpl();
	public static PlayerDAOImpl getInstance() {return instance;}
	private PlayerDAOImpl() {}

	@Override
	public List<String> selectPositions() {
		List<String> list = null;
		try {
			String sql = "SELECT DISTINCT POSITION position\r\n" + 
					"FROM PLAYER";
			PreparedStatement state = DatabaseFactory
									.createDatabase(Constants.VENDOR)
									.getConnection()
									.prepareStatement(sql);
			ResultSet rs = state.executeQuery(sql);
			list = new ArrayList<>();
			while (rs.next()) {
				list.add(rs.getString("position"));
			}
			state.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<String> selectPlayerByPostionAndTeamId(PlayerBean player) {
		List<String> list = null;
		try {
			PreparedStatement state = DatabaseFactory.createDatabase(Constants.VENDOR)
										.getConnection()
										.prepareStatement("SELECT PLAYER_NAME \"name\"\r\n" + 
												"FROM PLAYER\r\n" + 
												"WHERE TEAM_ID LIKE '"+player.getTeamId()+"'\r\n" + 
												"    AND POSITION LIKE '"+player.getPosition()+"'".toString());
			ResultSet rs = state.executeQuery("SELECT PLAYER_NAME \"name\"\r\n" + 
					"FROM PLAYER\r\n" + 
					"WHERE TEAM_ID LIKE '"+player.getTeamId()+"'\r\n" + 
					"    AND POSITION LIKE '"+player.getPosition()+"'");
			list = new ArrayList<>();
			while (rs.next()) {
				list.add(rs.getString("name"));
			}
			state.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<PlayerBean> selectPlayerByTeamIdAndHeightAndName(PlayerBean player) {
		List<PlayerBean> list = null;
		try {
			PreparedStatement state = DatabaseFactory.createDatabase(Constants.VENDOR)
														.getConnection()
														.prepareStatement("SELECT TEAM_ID, PLAYER_NAME, HEIGHT\r\n" + 
																						"FROM PLAYER\r\n" + 
																						"WHERE TEAM_ID LIKE '"+player.getTeamId()+"'\r\n" + 
																						"    AND HEIGHT >= "+ player.getHeight() +"\r\n" + 
																						"    AND PLAYER_NAME LIKE '"+player.getPlayerName()+"%'".toString());
			ResultSet rs = state.executeQuery("SELECT TEAM_ID, PLAYER_NAME, HEIGHT\r\n" + 
						"FROM PLAYER\r\n" + 
						"WHERE TEAM_ID LIKE '"+player.getTeamId()+"'\r\n" + 
						"    AND HEIGHT >= "+ player.getHeight() +"\r\n" + 
						"    AND PLAYER_NAME LIKE '"+player.getPlayerName()+"%'");
			list = new ArrayList<PlayerBean>();
			while(rs.next()) {
			PlayerBean param = new PlayerBean ();
			param.setTeamId(rs.getString(1));
			param.setHeight(rs.getString(3));
			param.setPlayerName(rs.getString(2));
			System.out.println(param.toString());
			list.add(param);
			}
			state.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return list;
	}

}
