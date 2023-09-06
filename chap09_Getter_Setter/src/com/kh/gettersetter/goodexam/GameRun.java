package com.kh.gettersetter.goodexam;

public class GameRun {

	public static void main(String[] args) {
		
		GoodPlayer player1 = new GoodPlayer();

		player1.setName("공격자");
		player1.isValidName();
		
		player1.setHealth(-10);
		player1.isValidHealth();

		player1.setAttackPower(-20);
		player1.isValidAttackPower();

		player1.displayInfo();
		
		GoodPlayer player2 = new GoodPlayer();
		
		player2.setName("방어자");
		player2.isValidName();
		
		player2.setHealth(100);
		player2.isValidHealth();
		
		player2.setAttackPower(10);
		player2.isValidAttackPower();
		
		player2.displayInfo();
		
		System.out.println("Attack!!");

		player1.attack(player2);
	}

}
