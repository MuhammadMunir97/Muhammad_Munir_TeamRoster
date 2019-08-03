package com.muhammad.teamroster.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.muhammad.teamroster.modell.Roster;
import com.muhammad.teamroster.modell.Team;

/**
 * Servlet implementation class DeletePlayer
 */
@WebServlet("/DeletePlayer")
public class DeletePlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Roster roster = (Roster) session.getAttribute("roster");
		if (roster == null) {
			roster = new Roster();
		}
		Integer id = Integer.parseInt(request.getParameter("id"));
		if(id.equals(null)) {
			id =0;
		}
		Integer currTeam = (Integer) session.getAttribute("currentTeam");
		Team team = roster.getTeam(currTeam);
		team.removePlayer(id);
		session.setAttribute("roster", roster);
		session.setAttribute("teams", roster.getTeams());
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
