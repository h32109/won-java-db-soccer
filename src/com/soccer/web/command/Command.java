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
		this.view = String.format(Constants.DOUBLE_PATH, domain, page);
	}
}
