package com.ignaciopiquerez.sofkachallange;

import java.awt.EventQueue;
import java.util.List;

import com.ignaciopiquerez.sofkachallange.controllers.WindowController;
import com.ignaciopiquerez.sofkachallange.model.Round;
import com.ignaciopiquerez.sofkachallange.repository.RoundRepository;
import com.ignaciopiquerez.sofkachallange.view.MainWindow;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					populateData();
					initialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static RoundRepository roundsRepo;
	
	private static void populateData() {
		roundsRepo = new RoundRepository();
	}
	
	private static void initialize() {
	MainWindow window = new MainWindow();
	List<Round> rounds = roundsRepo.getRounds();
	WindowController controller = new WindowController(window, rounds);
	}
}
