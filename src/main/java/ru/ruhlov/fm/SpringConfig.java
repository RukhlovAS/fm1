package ru.ruhlov.fm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringConfig {
	
	@Bean
	public String name() {		
		return "My Team";
	}
	
	@Bean
	public Team team() {
		return new Team(players(), name());
	}
	
	@Bean
	public List<Player> players(){
		List<Player> players = new ArrayList<>();
		for(int i=0; i<11; i++) {
			players.add(new Player(name() + " " + "player " + " " + i));
		}
		return players;
	}
	
	@Bean
	public Test test() {
		return new Test(team());
	}
	

}
