package com.kh.practice4.func;
import java.util.Scanner;

public class IfPractice2 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수 입력받아 평균 60점 이상이면 합격
		
		Scanner sc = new Scanner(System.in);
		
		int koreanScore, englishScore, mathScore, sum, ave;
		
		System.out.println("각 과목의 점수를 입력해주세요.");
	
		System.out.print("국어 점수: ");
		koreanScore = sc.nextInt();
		
		System.out.print("영어 점수: ");
		englishScore = sc.nextInt();
		
		System.out.print("수학 점수: ");
		mathScore = sc.nextInt();
		
		sum = koreanScore + englishScore + mathScore;
		ave = sum/3;
		
		if (ave < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("국어 점수: " + koreanScore);
			System.out.println("영어 점수: " + englishScore);
			System.out.println("수학 점수: " + mathScore);
			System.out.println("총 점수: " + sum);
			System.out.println("평균 점수: " + ave);
			System.out.println("합격입니다!");
		}	
	}

}
