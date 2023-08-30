package com.kh.operator;

public class Comparison {

	public static void main(String[] args) {
		// 4. 비교 연산자 (Comparison)
		// 값을 비교할 때 사용
		/*
		 * 크기, 등호 비교 등을 수행할 수 있음
		 * 두 개의 항 중에서 어떤 것이 더 크거나, 작거나, 같거나, 다른지를 판단
		 * 비교 연산자의 결과 값은 참(true) 또는 거짓(false)으로 반환
		 * > 왼쪽 항이 크면 참, 아니면 거짓을 반환
		 * < 왼쪽 항이 작으면 참, 아니면 거짓을 반환
		 * >= 왼쪽 항이 크거나 같으면 참, 아니면 거짓을 반환
		 * <= 왼쪽 항이 작거나 같으면 참, 아니면 거짓을 반환
		 * == 두 항의 값이 같으면 참, 아니면 거짓을 반환
		 * != 두 항의 값이 다르면 참, 아니면 거짓을 반환
		 */
		
		int p = 5;
		int q = 10;
		
		System.out.println("boolean을 넣지 않음: " + (p == q));
		
		boolean isEqual = (p == q);
		
		System.out.println(isEqual);
		
		int r = 5;
		
		System.out.println(p == r);
		
		boolean isEqual1 = (p != q);
		
		System.out.println("p != q: " + isEqual1);
		
		boolean isEqual2 = (p != r);
		
		System.out.println("p != r: " + isEqual2);
	}

}
