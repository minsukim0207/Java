package com.kh.goodexam.game;

public class GameModel {

	private int secretNumber;
	private int attempts;
	
	public GameModel() {
		secretNumber = (int) (Math.random() * 100) + 1; // 1~100 사이 무작위 숫자
		attempts = 0;
	}
	
	public int getSecretNumber() {
		return this.secretNumber;
	}
	
	public int getAttemps() {
		return this.attempts;
	}
	
	public void incrementAttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess(int guess) {
		incrementAttempts();
		return guess == this.secretNumber;
	}
}
