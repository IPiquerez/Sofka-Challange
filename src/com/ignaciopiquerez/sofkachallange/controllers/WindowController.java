package com.ignaciopiquerez.sofkachallange.controllers;

import java.awt.Color;
import java.util.Collections;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.ignaciopiquerez.sofkachallange.dao.PlayerDao;
import com.ignaciopiquerez.sofkachallange.model.Answer;
import com.ignaciopiquerez.sofkachallange.model.Category;
import com.ignaciopiquerez.sofkachallange.model.Player;
import com.ignaciopiquerez.sofkachallange.model.Question;
import com.ignaciopiquerez.sofkachallange.model.Round;
import com.ignaciopiquerez.sofkachallange.view.GamePanel;
import com.ignaciopiquerez.sofkachallange.view.MainPanel;
import com.ignaciopiquerez.sofkachallange.view.MainWindow;
import com.ignaciopiquerez.sofkachallange.view.PlayerHistoryPanel;
import com.ignaciopiquerez.sofkachallange.view.ResultPanel;

public class WindowController {

	private MainWindow window;
	private List<Round> rounds;
	private int currentRound;
	private GamePanel panel;
	private Player player;
	private Question currentQuestion;
	private int validAnswer;
	private Round round;
	private boolean win;
	private PlayerDao playerDao;
	
	public WindowController(MainWindow window, List<Round> rounds) {
		super();
		this.window = window;
		this.rounds = rounds;
		playerDao = new PlayerDao();
		initController();
	}
	
	
	private void initController() {
		MainPanel mpanel = new MainPanel();
		mpanel.getBtnStart().addActionListener(e -> startGamePanel());
		mpanel.getBtnHistory().addActionListener(e -> playerHistory());
		this.window.getFrame().setContentPane(mpanel);
		this.window.getFrame().setVisible(true);
	}
	
	private void startGamePanel () {
		player = new Player();
		panel = new GamePanel();
		currentRound = 0;
		panel.getBtnEnd().addActionListener(e -> endGame(true));
		panel.getBtnAnsw1().addActionListener(e-> buttonPress(1));
		panel.getBtnAnsw2().addActionListener(e-> buttonPress(2));
		panel.getBtnAnsw3().addActionListener(e-> buttonPress(3));
		panel.getBtnAnsw4().addActionListener(e-> buttonPress(4));
		window.getFrame().setContentPane(panel);
		window.getFrame().setVisible(true);
		setGamePanel(currentRound);
		}
	
	
	private void setGamePanel(int roundNumber) 
	{
		round = rounds.get(roundNumber);
		panel.getLblAward().setText(setRoundAward(round.getAward()));
		panel.getLblPoints().setText(setPlayerPoints(player.getPoints()));
		panel.getLblLevel().setText(setlblLevel(roundNumber+1));
		setQA(round);
	}
	
	private void setQA(Round round){
		Category cat = round.getCategory();
		currentQuestion = cat.getRandomQuestion();
		List<Answer> answers = currentQuestion.getAnswers();
		Collections.shuffle(answers);
		for(int i=0;i<answers.size();i++) {
			if(answers.get(i).isValid())
				validAnswer= i+1;
		}
		panel.getBtnAnsw1().setText(answers.get(0).getContent());
		panel.getBtnAnsw2().setText(answers.get(1).getContent());
		panel.getBtnAnsw3().setText(answers.get(2).getContent());
		panel.getBtnAnsw4().setText(answers.get(3).getContent());
		panel.getLblQuestion().setText(currentQuestion.getContent());
		System.out.println("La respuesta valida es la "+ validAnswer);
	}
	
	private String setRoundAward(int award){
		return String.format("Por %s puntos", Integer.toString(award));
	}
	
	private String setlblLevel(int level){
		return String.format("Nivel %s", Integer.toString(level));
	}
	
	private String setPlayerPoints(int points){
		return String.format("Puntos actuales: %s", Integer.toString(points));
	}
	
	private void endGame(boolean win) {
		this.win = win;
		savePlayerData();
		toResultPage();
	}
	
	private void savePlayerData() {
		playerDao.savePlayer(player);
	}
	
	private void buttonPress(int btnNumber) {
		//Answered correctly
		if (btnNumber == validAnswer) {
			player.setPoints(player.getPoints()+ round.getAward());
			player.setRoundsReached(player.getRoundsReached()+1);
			currentRound++;
			if (currentRound < rounds.size())
				setGamePanel(currentRound);
			else 
				endGame(true);
		}
		//Answered incorrectly
		else {
			endGame(false);
		}
	}
	
	private void toResultPage() {
		ResultPanel panel = new ResultPanel();
		panel.getBtnContinue().addActionListener(e -> mainMenu());
		panel.getLblPointsEarned().setText("Puntos obtenidos: " + player.getPoints());
		panel.getLblRoundsReached().setText("Ultimo nivel: " + player.getRoundsReached());
		if(win) {	
			panel.getLblResult().setText("Felicitaciones, has ganado!");
			panel.getLblResult().setForeground(Color.GREEN);
		}
		else {
			panel.getLblResult().setText("Has perdido");
			panel.getLblResult().setForeground(Color.RED);
		}
		window.getFrame().setContentPane(panel);
		window.getFrame().setVisible(true);
	}
	
	private void mainMenu() {
		initController();
	}
	
	private void playerHistory() {
		PlayerHistoryPanel panel = new PlayerHistoryPanel();
		window.getFrame().setContentPane(panel);
		window.getFrame().setVisible(true);
		panel.getBtnMenu().addActionListener(e -> mainMenu());
		populatePlayerTable(panel);
	} 
	
	private void populatePlayerTable(PlayerHistoryPanel panel) {
		List<Player> players = playerDao.getPlayers();
		Object[][] array = new Object[players.size()][3];
        int fila = 0;
        //Pasar datos de la lista de usuarios a un array[][] para llenar el modelo de la tabla
        for (Player p: players) {
        	array[fila][0]=p.getPoints();
        	array[fila][1]=p.getRoundsReached();
        	fila++;
        }
		String[] columnNames = {"Puntos","Nivel alcanzado"};
		//Creación de la Tabla
		DefaultTableModel model = new DefaultTableModel();
		//Lleno el modelo con los datos
		model.setDataVector(array, columnNames);
		panel.getTable().setModel(model);
	}
}
