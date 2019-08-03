package com.muhammad.teamroster.modell;

import java.io.Serializable;
import java.util.HashMap;


public class Roster implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HashMap<Integer, Team> teams;

	public Roster () {
		teams = new HashMap<Integer, Team>();
	}
	
	public HashMap<Integer, Team> getTeams() {
		return teams;
	}
	
	public Team getTeam(Integer id) {
		return teams.get(id);
	}
	
	public void setTeams(Team team) {
		this.teams.put(Team.getNumOfTeams(), team);
	}
	
	public void removeTeam(Integer id) {
		teams.remove(id);
	}
}
