package com.ignaciopiquerez.sofkachallange.model;

public class Player {

	private int points;
	private int roundReached;
	
	public Player() {
		this.points = 0;
		this.roundReached = 1;
	}
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	public int getRoundsReached() {
		return roundReached;
	}
	public void setRoundsReached(int roundReached) {
		this.roundReached = roundReached;
	}
	
}
