package com.soccer.web.services;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerService {
	public boolean login(PlayerBean param);
	//2. 포지션 종류(중복제거,없으면 빈공간)
	public List<String> findPositions();
	//4. 팀아이디, 포지션으로 선수정보
	public List<String> findPlayerByPostionAndTeamId(PlayerBean player);
	//5. 팀아이디, 키, 이름으로 선수정보
	public List<PlayerBean> findPlayerByTeamIdAndHeightAndName(PlayerBean player);
}
