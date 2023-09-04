package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// 학생 객체 생성
		Student student1 = new Student("홍길동", 20, "1학년");
		Student student2 = new Student("이순신", 21, "2학년");
		Student student3 = new Student("세종대왕", 22, "3학년");
		
		// 학생 정보 출력
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
	}
}
