package com.soccer.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sender {
	
	public static void forward(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("---------2-------------");
		System.out.println(Reciever.cmd.getView());
		try {
			request
			.getRequestDispatcher(Reciever.cmd.getView())
			.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void redirect(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			response.sendRedirect("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
