package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

public class MoveCommand extends Command {
 
public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setPage(request.getParameter("page"));
		setAction(request.getParameter("action"));
		execute();
	}

}
