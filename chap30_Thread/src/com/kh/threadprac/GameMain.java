package com.kh.threadprac;
import java.io.IOException;

public class GameMain {
	private static boolean isGameOver = false;
	
	public boolean getIsGameOver() {
		return isGameOver;
	}
	
	public static void main(String[] args) {
		GameLoop gl = new GameLoop();
		
		Thread gameThread = new Thread(gl);
		gameThread.start();
		
		try {
			System.in.read();
			isGameOver = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}	