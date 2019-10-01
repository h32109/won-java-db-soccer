package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

import lombok.Data;

@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String domain, view, page, action;
	@Override
	public void execute() {
		switch (page) {
		case "home" :
			this.domain = "facade";
			break;
		case "login":
			this.domain =  "facade";
		case "join":
			this.domain =  "facade";
			break;
		}
		this.view = String.format(Constants.DOUBLE_PATH, domain, page);

	}
}
