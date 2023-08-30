package com.kh.whilesample;

public class WhileSample {

	public static void main(String[] args) {
		// While
		// 특정 조건이 참인 동안에 반복적으로 코드 블록을 실행
		// 조건이 참인지 거짓인지 검사한 후, 참인 동안 동안 코드 블록이 실행
		// 조건이 거짓일 때 반복이 중지
		
		int count = 1;
		
		while (count <= 5) {
			System.out.println("반복: " + count);
			count++;
		}
	}

}
