package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class LoginCommand extends Command {
		protected PlayerBean player;
	
	
	public LoginCommand(HttpServletRequest request) {
		player = new PlayerBean();
		player.setPlayerId(request.getParameter("playerId"));
		player.setSolar(request.getParameter("solar"));
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	
	@Override
	public void execute() {
		if(PlayerServiceImpl.getInstance().login(player)==true) {
			setPage(request.getParameter("page"));
		}else{
			setPage("login");
		}
		super.execute();
	}

	
}
