package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. 삼항 연산자
		// 조건을 평가하고 두 가지 값 중 하나를 반환
		// 조건 ? 값1(True) : 값2(False)
		
		int age = 20;
		
		String status = (age >= 20) ? "성인" : "미성년자";
		
		System.out.println(status);
		
		int score = 85;
		
		String result = (score >= 60) ? "합격" : "불합격";
		
		System.out.println("시험 결과: " + result);
		
		int number = -5;
		
		String sign = (-5 > 0) ? "true" : "false";
		
		System.out.println("sigh: " + sign);
		
		int temperature = 25;
		
		String weather = (temperature > 21) ? "적당" : "추운";
		
		System.out.println("날씨: " + weather);
		
		// 숫자 7의 값을 짝수인지 홀수인지 출력
		
		int num = 7;
		
		String str = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println("7은 짝수?: " + str);
		
		int number2 = -5;
		
		String sign2 = (number2 > 0) ? "양수" : (number2 < 0) ? "음수" : "0";
		
		System.out.println(sign2);
	}

}
