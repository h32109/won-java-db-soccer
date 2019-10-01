package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class CreateCommand extends Command {
	
	public CreateCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action"));
		execute();
	}
	
	public void execute() {
		PlayerBean param = new PlayerBean();
		param.setPlayerId(request.getParameter("playerId"));
		param.setPlayerName(request.getParameter("playerName"));
		param.setEPlayerName(request.getParameter("ePlayerName"));
		param.setHeight(request.getParameter("height"));
		param.setWeight(request.getParameter("weight"));
		param.setBackNo(request.getParameter("backNo"));
		param.setBirthDate(request.getParameter("birthDate"));
		param.setJoinYyyy(request.getParameter("joinYyyy"));
		param.setNation(request.getParameter("nation"));
		param.setNickName(request.getParameter("nickname"));
		param.setSolar(request.getParameter("solar"));
		param.setTeamId(request.getParameter("teamId"));
		param.setPosition(request.getParameter("position"));
		PlayerServiceImpl.getInstance().playerjoin(param);
		setDomain("facade");
		setPage("main");
		super.execute();
		request.setAttribute("page", request.getParameter("page"));
	}
}
