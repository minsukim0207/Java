package com.kh.threadprac;
import java.util.Random;

public class GameLoop implements Runnable {
	GameMain gm = new GameMain();
	
	@Override
	public void run() {
		while (!gm.getIsGameOver()) {
			int randomValue = new Random().nextInt(10);
			System.out.println("������ ����: " + randomValue);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("������ �����Ϸ��� Enter�� ��������.");
		}
	}
}