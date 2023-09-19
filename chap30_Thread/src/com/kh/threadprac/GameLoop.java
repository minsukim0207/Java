package com.kh.threadprac;
import java.util.Random;

public class GameLoop implements Runnable {
	GameMain gm = new GameMain();
	
	@Override
	public void run() {
		while (!gm.getIsGameOver()) {
			int randomValue = new Random().nextInt(10);
			System.out.println("임의의 숫자: " + randomValue);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("게임을 종료하려면 Enter를 누르세요.");
		}
	}
}