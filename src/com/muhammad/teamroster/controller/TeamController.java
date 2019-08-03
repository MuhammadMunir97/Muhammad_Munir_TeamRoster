package com.muhammad.teamroster.controller;

import java.io.IOException;
import java.util.HashMap;

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
 * Servlet implementation class TeamController
 */
@WebServlet("/TeamController")
public class TeamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Team.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Roster roster = (Roster) session.getAttribute("roster");
		Team team = new Team(request.getParameter("name"));
		if (roster == null) {
			roster = new Roster();
		}
		roster.setTeams(team);
		session.setAttribute("roster", roster);
		request.setAttribute("teams", roster.getTeams());
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Index.jsp");
		view.forward(request, response);
	}

}
