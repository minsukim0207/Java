package com.kh.threadmain;

public class ThreadPriorityExam {

	public static void main(String[] args) {
		
		StudentThread student1 = new StudentThread("�л�1");
		StudentThread student2 = new StudentThread("�л�2");
		
		// ������ �켱 ���� ����
		student1.setPriority(Thread.MAX_PRIORITY);
		student2.setPriority(Thread.MIN_PRIORITY);
		
		// ������ ����
		student1.start();
		student2.start();
	}
}
