package com.ignaciopiquerez.sofkachallange.controllers;

import java.util.List;

import com.ignaciopiquerez.sofkachallange.model.Answer;
import com.ignaciopiquerez.sofkachallange.model.Category;
import com.ignaciopiquerez.sofkachallange.model.Question;
import com.ignaciopiquerez.sofkachallange.model.Round;
import com.ignaciopiquerez.sofkachallange.view.GamePanel;
import com.ignaciopiquerez.sofkachallange.view.MainWindow;

public class WindowController {

	private MainWindow window;
	private List<Round> rounds;
	
	public WindowController(MainWindow window, List<Round> rounds) {
		super();
		this.window = window;
		this.rounds = rounds;
		//this.window.getFrame().setVisible(true);
		initController();
	}
	
	private void initController() {
		window.getBtnStart().addActionListener(e -> startGame());
		window.getBtnConfGame().addActionListener(e -> configGame());
	}
	
	private void startGame () {
		GamePanel panel = new GamePanel();
		window.getFrame().setContentPane(panel);
		window.getFrame().setVisible(true);
		printContent();
		}
	
	private void configGame() {
		
	}
	
	private void printContent() {
		for(Round r: rounds) {
			System.out.println(r.getAward());
			System.out.println(r.getNumber());
			Category c = r.getCategory();
			for(Question q : c.getQuestions()) {
				System.out.println("Pregunta: "+ q.getContent());
				for(Answer a : q.getAnswers()) {
					System.out.println("Respuesta: " +a.getContent());
					System.out.println("Valida? "+ a.isValid());
				}
			}
		}
	}
		
}
