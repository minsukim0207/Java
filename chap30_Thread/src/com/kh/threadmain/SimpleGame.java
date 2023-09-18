package com.kh.threadmain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {

	private static boolean isGameOver = false;

	public static void main(String[] args) {
		SimpleGame sg = new SimpleGame();
		// ���� ���� ������ ����
		Thread gameThread = new Thread(sg.new GameLoops());
		gameThread.start();
		
		// ���� ���� ���� : �÷��̾ Enter Ű �Է� ��
		try {
			System.in.read(); // ����ڰ� �Է��� ����Ʈ�� ����. ����ڰ� Enter �Է� �ñ��� �Ͻ� ����
			isGameOver = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
class GameLoops implements Runnable {

		@Override
		public void run() {
			while (!isGameOver) {
				// ���� ���� ����
				int randomValue = new Random().nextInt(100);
				System.out.println("������ ����: " + randomValue);
				
				// ���� ���� ���� �ð�
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("���� ����");
			}
		}
	}
}

