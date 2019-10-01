package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class LoginCommand extends Command {
	
	
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action"));
		execute();
	}
	
	@Override
	public void execute() {
		PlayerBean player = new PlayerBean();
		player.setPlayerId(request.getParameter("playerId"));
		player.setSolar(request.getParameter("solar"));
		if(PlayerServiceImpl.getInstance().login(player)==true) {
			setPage(request.getParameter("page"));
			setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		}else{
			setPage("main");
			setDomain("facade");
			request.setAttribute("page", request.getParameter("action"));
		}
		super.execute();
	}

	
}
