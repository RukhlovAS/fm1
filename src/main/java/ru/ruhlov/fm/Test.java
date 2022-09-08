package ru.ruhlov.fm;


import org.springframework.stereotype.Component;

@Component
public class Test {	
	private Team team;
	private String name = "Artem";
	
	public Test(Team team) {		
		this.team = team;
	}
	
	public String getName() {
		return name;
	}
	
	public void getString() {
		System.out.println(name);
		team.getRoster();
	}

}
