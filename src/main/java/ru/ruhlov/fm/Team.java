package ru.ruhlov.fm;


import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Team {
	private String name;
	private List<Player> players;	
	
	public String getName() {
		return name;
	}
	
	public Team(List<Player> players, String name) {
		this.players = players;
		this.name = name;
	}
	
	public void getRoster() {
		for (Player pl : players) {
			System.out.println(pl.getName() + " power " + pl.getPower());
		}
	}
	
	
}
