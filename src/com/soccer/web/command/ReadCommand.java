package com.soccer.web.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class ReadCommand  extends Command {
	protected PlayerBean player;

	public ReadCommand(HttpServletRequest request) {
		setRequest(request);
		setPage(request.getParameter("page"));
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	
	@Override
	public void execute() {
		switch (request.getParameter("page")) {
		case "2_positions":
			request.setAttribute("position", PlayerServiceImpl.getInstance().findPositions());
			break;
		case "4_find_by_teamid_position":
			player = new PlayerBean();
			player.setTeamId(request.getParameter("teamId"));
			player.setPosition(request.getParameter("position"));
			request.setAttribute("player", player);
			request.setAttribute("players", PlayerServiceImpl.getInstance().findPlayerByPostionAndTeamId(player));
			break; 
		case "5_find_by_teamid_height_name":
			player = new PlayerBean();
			player.setTeamId(request.getParameter("teamId"));
			player.setHeight(request.getParameter("height"));
			player.setPlayerName(request.getParameter("name"));
			request.setAttribute("players2", PlayerServiceImpl.getInstance().findPlayerByTeamIdAndHeightAndName(player));
			break;
		default:
			break;
		}
		super.execute();
	}


}
