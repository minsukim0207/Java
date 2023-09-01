package com.kh.arraysample;
import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		// Array
		// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		// 동일한 데이터 타입을 가진 여러 값을 한 곳에 저장하고 인덱스를 사용하여 각 값에 접근
		// 데이터를 보다 효율적으로 저장하고 관리
		// 데이터 집합을 쉽게 다룰 수 있도록 도와줌
		
		/*
		 * 특징
		 * 1. 고정된 크기
		 * 생성 할 때 크기가 결정되고, 이후 크기 변경 불가능
		 * 
		 * 2. 같은 데이터 타입
		 * 배열 내의 모든 요소는 동일한 데이터 타입
		 * 
		 * 3. index 기반 접근
		 * 각 배열의 요소는 순차적인 index를 가지며, 0부터 시작해서 배열 크기 -1까지의 크기를 가짐
		 * index를 사용하여 특정 위치의 요소에 접근 가능
		 * 
		 * 4. 배열의 길이 (length)
		 * 배열의 길이를 알 수 있다
		 */
		
		String[] food = {"과자1", "과자2", "과자3", "과자4"};
		
		int foodLength = food.length;
		
		System.out.println(foodLength);
		
	}
}
