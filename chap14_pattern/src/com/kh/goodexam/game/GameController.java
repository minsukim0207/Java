package com.kh.goodexam.game;
import java.util.Scanner;

public class GameController {

	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		view.displayMessage();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			view.displayGuessPromt();
			int guess = sc.nextInt();
		
			if(model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttemps());
				break;
			} else {
				view.displayIncorrectGuess();
				view.displayAttempts(model.getAttemps());
			}
		}
		
		view.displayGameOver();
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m, v);
		
		c.runGame();
	}
}
