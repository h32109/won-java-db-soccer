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
		List<String> list = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION position\r\n" + 
					"FROM PLAYER";
			PreparedStatement state = DatabaseFactory
									.createDatabase(Constants.VENDOR)
									.getConnection()
									.prepareStatement(sql);
			ResultSet rs = state.executeQuery(sql);
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
		List<String> list = new ArrayList<>();
		try {
			String sql = "SELECT PLAYER_NAME \"name\"\r\n" + 
					"FROM PLAYER\r\n" + 
					"WHERE TEAM_ID LIKE ?\r\n" + 
					"    AND POSITION LIKE ?";
			PreparedStatement state = DatabaseFactory.createDatabase(Constants.VENDOR)
										.getConnection()
										.prepareStatement(sql);
			state.setString(1, player.getTeamId());
			state.setString(2, player.getPosition());
			ResultSet rs = state.executeQuery();
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
		List<PlayerBean> list = new ArrayList<PlayerBean>();
		System.out.println("---------------3---------------");
		try {
			String sql = "SELECT *\r\n" + 
					"FROM PLAYER\r\n" + 
					"WHERE TEAM_ID LIKE ?\r\n" + 
					"    AND HEIGHT >= ?\r\n" + 
					"    AND PLAYER_NAME LIKE ?";
			PreparedStatement state = DatabaseFactory.createDatabase(Constants.VENDOR)
														.getConnection()
														.prepareStatement(sql);
			state.setString(1, player.getTeamId());
			state.setString(2, player.getHeight());
			state.setString(3, player.getPlayerName()+"%");
			ResultSet rs = state.executeQuery();
			while(rs.next()) {
				PlayerBean param = new PlayerBean ();
				param.setBackNo(rs.getString("BACK_NO"));
				param.setBirthDate(rs.getString("BIRTH_DATE"));
				param.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				param.setHeight(rs.getString("HEIGHT"));
				param.setJoinYyyy(rs.getString("JOIN_YYYY"));
				param.setNation(rs.getString("NATION"));
				param.setNickName(rs.getString("NICKNAME"));
				param.setPlayerName(rs.getString("PLAYER_NAME"));
				param.setSolar(rs.getString("SOLAR"));
				param.setTeamId(rs.getString("TEAM_ID"));
				param.setWeight(rs.getString("WEIGHT"));
				param.setHeight(rs.getString("HEIGHT"));
				param.setPosition(rs.getString("POSITION"));
				System.out.println(param.toString());
				list.add(param);
			}
			state.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return list;
	}
	@Override
	public boolean login(PlayerBean param) {
		String id = param.getPlayerId(), pw = param.getSolar(), resultid = "" , resultpw = "";
		boolean flag = false;
		try {
			String sql = "SELECT PLAYER_ID, SOLAR\r\n" + 
					"FROM PLAYER\r\n" + 
					"WHERE PLAYER_ID LIKE ?" ;
			PreparedStatement state = DatabaseFactory.createDatabase(Constants.VENDOR)
					.getConnection().prepareStatement(sql);
			state.setString(1, param.getPlayerId());
			ResultSet rs = state.executeQuery();
			while(rs.next()) {
				resultid = rs.getString(1);
				resultpw = rs.getString(2);
			}
			state.close();
			if(id.equals(resultid)&&pw.equals(resultpw)) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	

}
