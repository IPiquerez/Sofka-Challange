package com.ignaciopiquerez.sofkachallange.model;

import java.util.ArrayList;
import java.util.Random;

public class Category {
	private int dificultyLevel;

	private ArrayList<Question> questions;
	
	private Random rand = new Random();
	
	public int getDificultyLevel() {
		return dificultyLevel;
	}

	public void setDificultyLevel(int dificultyLevel) {
		this.dificultyLevel = dificultyLevel;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	
	public void addQuestion(Question q) {
		this.questions.add(q);
	}
	
	public Question getRandomQuestion() {
		int bound = questions.size()-1;
		int rnd = rand.nextInt(bound);
		return questions.get(rnd);
	}
}
