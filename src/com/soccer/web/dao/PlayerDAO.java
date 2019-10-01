package com.soccer.web.dao;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerDAO {
	 
	public List<String> selectPositions();
	public List<String> selectPlayerByPostionAndTeamId(PlayerBean player);
	public List<PlayerBean> selectPlayerByTeamIdAndHeightAndName(PlayerBean player);
	public boolean login(PlayerBean param);
}
