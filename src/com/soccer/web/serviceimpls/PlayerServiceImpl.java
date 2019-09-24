package com.soccer.web.serviceimpls;

import java.util.List;

import com.soccer.web.daoimpls.PlayerDAOImpl;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService {
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	
	private PlayerServiceImpl() {
	}

	@Override
	public List<String> findPositions() {
			List<String> list = PlayerDAOImpl.getInstance().selectPositions();
		return list;
	}

	@Override
	public List<String> findPlayerByPostionAndTeamId(PlayerBean player) {
		return PlayerDAOImpl.getInstance().selectPlayerByPostionAndTeamId(player);
	}

	@Override
	public List<PlayerBean> findPlayerByTeamIdAndHeightAndName(PlayerBean player) {
		return PlayerDAOImpl.getInstance().selectPlayerByTeamIdAndHeightAndName(player);
	}

}
