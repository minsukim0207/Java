package com.kh.threadmain;

public class ThreadMain extends Thread{
/*
 * Thread
 * ���μ��� ������ ����Ǵ� �������� ���� �帧
 * ��Ƽ�������� ���� ���� �۾��� ���� ����
 */
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("������ ���� �� " + i);
		}
		try {
			Thread.sleep(5000); // 1�� ���� ������ �Ͻ� ����
			System.out.println("������ �۾� ��?");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ThreadMain thread1 = new ThreadMain();
		ThreadMain thread2 = new ThreadMain();
		
		// ������ ����
		thread1.start();
		thread2.start();
		
		// main �����忡�� �ٸ� �۾��� ���� ����
		try {
			thread1.join(); // thread1�� ����� ������ ���
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��� ������ ����");
	}
}