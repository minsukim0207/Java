package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1부터 100까지 합
		
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			sum += i;
			i++;
			// System.out.println(sum);
			// sum의 합계를 주기적으로 보고 싶으면 while문 안에 작성
		}
		
		System.out.println(sum);
		// while 종료와 클래스 종료는 무관
	}

}
