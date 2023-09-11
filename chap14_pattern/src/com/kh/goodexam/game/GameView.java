package com.kh.goodexam.game;

public class GameView {
	String welcome = "���� ���߱� ������ �����մϴ�.";
	String oneToHundred = "1���� 100������ ���ڸ� ���纸����.";
	String guessNumber = "������ ���ڸ� �Է��ϼ���: ";
	String rightAnswer = "���ڸ� ������ϴ�.";
	String wrongAnswer = "���ڰ� Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.";
	
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
		System.out.println("�õ� Ƚ��: " + attempts);
	}
	
	public void displayGameOver() {
		System.out.println("���� ����");
	}

}
