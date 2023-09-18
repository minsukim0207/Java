package com.kh.threadmain;

public class ThreadPriorityExam {

	public static void main(String[] args) {
		
		StudentThread student1 = new StudentThread("학생1");
		StudentThread student2 = new StudentThread("학생2");
		
		// 스레드 우선 순위 설정
		student1.setPriority(Thread.MAX_PRIORITY);
		student2.setPriority(Thread.MIN_PRIORITY);
		
		// 스레드 시작
		student1.start();
		student2.start();
	}
}
