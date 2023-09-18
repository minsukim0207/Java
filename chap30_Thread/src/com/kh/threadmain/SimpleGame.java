package com.kh.threadmain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {

	private static boolean isGameOver = false;

	public static void main(String[] args) {
		SimpleGame sg = new SimpleGame();
		// 게임 루프 스레드 시작
		Thread gameThread = new Thread(sg.new GameLoops());
		gameThread.start();
		
		// 게임 종료 조건 : 플레이어가 Enter 키 입력 시
		try {
			System.in.read(); // 사용자가 입력한 바이트를 읽음. 사용자가 Enter 입력 시까지 일시 중지
			isGameOver = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
class GameLoops implements Runnable {

		@Override
		public void run() {
			while (!isGameOver) {
				// 게임 루프 내용
				int randomValue = new Random().nextInt(100);
				System.out.println("임의의 숫자: " + randomValue);
				
				// 게임 루프 지연 시간
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("게임 종료");
			}
		}
	}
}

