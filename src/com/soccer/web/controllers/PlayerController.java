package com.soccer.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;
import com.soccer.web.services.PlayerService;


@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action"),
				page = request.getParameter("page");
		System.out.println("액션 : "+action);
		switch (page) {
		case "2_positions":
			request.setAttribute("position", PlayerServiceImpl.getInstance().findPositions());
			break;
		case "4_find_by_teamid_position" :
			PlayerBean player = new PlayerBean();
			player.setTeamId(request.getParameter("teamId"));
			player.setPosition(request.getParameter("position"));
			request.setAttribute("player", player );
			request.setAttribute("players", PlayerServiceImpl.getInstance().findPlayerByPostionAndTeamId(player));
			break;
		case "5_find_by_teamid_height_name" :
			player = new PlayerBean();
			player.setTeamId(request.getParameter("teamId"));
			player.setHeight(request.getParameter("height"));
			player.setPlayerName(request.getParameter("name"));
			List<PlayerBean> players = PlayerServiceImpl.getInstance().findPlayerByTeamIdAndHeightAndName(player);
			request.setAttribute("players2", players);
			break;
		default:
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/player/"+page+".jsp");
		rd.forward(request, response);
	}

}
