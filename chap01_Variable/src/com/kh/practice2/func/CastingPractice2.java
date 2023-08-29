package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice2 {
	//실수형으로 국어, 영어, 수학 점수 입력 받아 총점과 평균을 출력
	//총점과 평균은 정수형으로 출력
	public static void main(String[] args) {
		double koreanScore, englishScore, mathScore;
		int sum, ave;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요: ");
		koreanScore = sc.nextDouble();
		
		System.out.print("영어 점수를 입력하세요: ");
		englishScore = sc.nextDouble();
		
		System.out.print("수학 점수를 입력하세요: ");
		mathScore = sc.nextDouble();
		
		sum = (int) (koreanScore + englishScore + mathScore);
		ave = (int) (koreanScore + englishScore + mathScore)/3;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + ave);
	}
	

}
