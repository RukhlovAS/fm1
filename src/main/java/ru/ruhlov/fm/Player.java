package ru.ruhlov.fm;


public class Player {
	private String name;
	private double power;
	public Player(String name) {
		this.name = name;
		this.power = Math.random()*100;
	}
	public String getName() {
		return name;
	}	
	public int getPower() {
		return (int)power;
	}	
	
}
