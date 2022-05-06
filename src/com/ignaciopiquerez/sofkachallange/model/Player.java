package com.ignaciopiquerez.sofkachallange.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Players")
public class Player {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	@Column(name = "points")
	private int points;
	
	@Column (name = "rounds_reached")
	private int roundsReached;
	
	public Player() {
		this.points = 0;
		this.roundsReached = 1;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoundsReached() {
		return roundsReached;
	}


	public void setRoundsReached(int roundsReached) {
		this.roundsReached = roundsReached;
	}

	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
}
