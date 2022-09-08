package ru.ruhlov.fm;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String name;
	private List<Player> players = new ArrayList<Player>();
	public Team(String name) {		
		this.name = name;
		for(int i=0; i<11; i++) {
			players.add(new Player("player " + name + " " + i));
		}
	}
	public String getName() {
		return name;
	}
	public void getRoster() {
		for (Player pl : players) {
			System.out.println(pl.getName() + " power " + pl.getPower());
		}
	}
	
}
