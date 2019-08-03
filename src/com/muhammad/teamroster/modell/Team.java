package com.muhammad.teamroster.modell;

import java.io.Serializable;
import java.util.HashMap;

public class Team implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	private static int numOfTeams = 0;
	private Integer id;
	private String name;	
	private HashMap<Integer, Player> players;

	public Team() {
		this.id = numOfTeams++;
	}
	
	public Team(String name) {
		this.id = numOfTeams++;
		this.name = name;
		players = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<Integer , Player> getPlayers() {
		return players;
	}
	
	@Override
	public String toString() {
		return " Team name: " + name + " " + " Size: " + players.size();
	}

	public void setPlayers(Player player) {
		players.put(Player.numOfPlayer, player);
	}
	
	public void removePlayer(Integer id) {
		players.remove(id);
	}
	
	public static int getNumOfTeams() {
		return numOfTeams;
	}
}
