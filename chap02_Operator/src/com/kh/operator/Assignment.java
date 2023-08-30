package com.kh.operator;

public class Assignment {

	public static void main(String[] args) {
		// 대입 연산자
		// 변수에 값을 할당할 때 사용
		// 오른쪽 피 연산자의 값을 왼쪽 피 연산자에 할당
		// 피 연산자: 처리될 데이터 그 자체 또는 데이터를 지정하는 컴퓨터 명령
		
		int a = 5;
		
		// 복합 대입 연산자
		// 변수의 현재 값과 다른 값을 계산하여 그 결과를 다시 변수에 저장
		// 코드를 좀 더 간결하게 작성하고 읽기 쉽게 만들 수 있다
		/*
		 * += 덧셈 후 대입
		 * -= 뺄셈 후 대입
		 * *= 곱셈 후 대입
		 * /= 나눗셈 후 대입
		 * *= 나머지 후 대입
		 * &= 비트 AND 후 대입
		 * |= 비트 OR 후 대입
		 * ^= 비트 XOR 후 대입
		 * <<== 왼쪽 시프트 후 대입
		 * >>== 오른쪽 시프트 후 대입
		 */
		
		 a += 5;
		 
		 System.out.println("a :" + a);
		 
		 int b = 15;
		 b -= 3;
		 
		 System.out.println("b: " + b);
		 
		 int c = 13;
		 c *= 2;
		 
		 System.out.println("c: " + c);
		 
		 int d = 15;
		 d /= 3;
		 
		 System.out.println("d: " + d);
		 
		 int e = 14;
		 e %= 5;
		 
		 System.out.println("e: " + e);
		
	}

}
