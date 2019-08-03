package com.muhammad.teamroster.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.muhammad.teamroster.modell.Player;
import com.muhammad.teamroster.modell.Roster;
import com.muhammad.teamroster.modell.Team;

/**
 * Servlet implementation class PlayerController
 */
@WebServlet("/PlayerController")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Player.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Integer age = Integer.parseInt(request.getParameter("age"));
		Player player = new Player(firstName, lastName, age);
		Roster roster = (Roster) session.getAttribute("roster");
		Integer currTeam = (Integer) session.getAttribute("currentTeam");
		Team team = roster.getTeam(currTeam);
		team.setPlayers(player);
		request.setAttribute("team", team);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/showTeam.jsp");
		view.forward(request, response);
	}

}
