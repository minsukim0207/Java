package com.kh.goodexam.game;

public class GameView {
	String welcome = "숫자 맞추기 게임을 시작합니다.";
	String oneToHundred = "1에서 100사이의 숫자를 맞춰보세요.";
	String guessNumber = "추측한 숫자를 입력하세요: ";
	String rightAnswer = "숫자를 맞췄습니다.";
	String wrongAnswer = "숫자가 틀렸습니다. 다시 시도하세요.";
	
	public void displayMessage() {
		System.out.println(welcome);
		System.out.println(oneToHundred);
	}
	
	public void displayGuessPromt() {
		System.out.print(guessNumber);
	}
	
	public void displayCorrectGuess() {
		System.out.println(rightAnswer);
	}
	
	public void displayIncorrectGuess() {
		System.out.println(wrongAnswer);
	}
	
	public void displayAttempts(int attempts) {
		System.out.println("시도 횟수: " + attempts);
	}
	
	public void displayGameOver() {
		System.out.println("게임 종료");
	}

}
