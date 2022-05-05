package com.ignaciopiquerez.sofkachallange.repository;

import java.util.List;

import com.ignaciopiquerez.sofkachallange.model.Round;
import com.ignaciopiquerez.sofkachallange.utils.JsonImporter;

public class RoundRepository {
	
    final String filePath = "rounds.json";
    
    private List<Round> rounds;
    
    public RoundRepository() {
    	JsonImporter<Round> jsonImporter = new JsonImporter<Round>();
    	this.rounds= jsonImporter.loadDataFromJson(filePath, Round.class);
	}

	public List<Round> getRounds() {
		return rounds;
	}    
}
