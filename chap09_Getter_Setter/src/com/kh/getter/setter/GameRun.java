package com.kh.getter.setter;

public class GameRun {

	public static void main(String[] args) {
		
		PlayerCharacter player1 = new PlayerCharacter();
		player1.displayInfo();
		player1.setName("공격자");
		player1.setHealth(-10);
		player1.setAttackPower(-20);
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("방어자");
		player2.setHealth(100);
		player2.setAttackPower(10);
		
		player2.displayInfo();
		
		System.out.println("Attack!!");
		
		player1.attack(player2);
		
	}

}
