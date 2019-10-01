package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.enums.Action;

public class Commander {

	public static Command direct(HttpServletRequest request) {
		System.out.println("----------1-----------");
		System.out.println(request.getParameter("action")+","+request.getParameter("page"));
		Command c = new Command();
		switch (Action.valueOf(request
											.getParameter("action")
											.toUpperCase())) {
		case READ : c = new ReadCommand(request);break;
		case MOVE : c = new MoveCommand(request);break;
		case LOGIN : c = new LoginCommand(request);break;
		default:
			break;
		}
		return c;
	}
}
