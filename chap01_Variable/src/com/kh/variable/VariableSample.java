package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "쿠팡";

		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		System.out.println("안녕하세요." + name + "입니다. 오늘" + hour + "시에 배송됩니다.");
		System.out.println("저의 성적은 " + score + "입니다.");
		System.out.println(score + "는" + grade + "입니다.");
		
		//변수에 이름과 나이와 자신의 성적(double)을 저장하고 출력하기.
		int myAge = 20;
		String myName = "김민수";
		double myScore = 82.0;
		char myGrade = 'B';
		System.out.println("안녕하세요. 저의 이름은 " + myName + "이고, 나이는 " + myAge + "입니다.");
		System.out.println("저의 성적은 " + myScore + "이며, 등급은 " + myGrade + "입니다.");
	}
}
