package com.kh.arrayListSample;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// 빈 ArrayList 생성
		ArrayList<String> fruits = new ArrayList<>();
		
		// 요소 추가
		fruits.add("사과");
		System.out.println(fruits);
		
		fruits.add("바나나");
		System.out.println(fruits);
		
		fruits.add("딸기");
		System.out.println(fruits);
		
		// 요소 개수 확인
		System.out.println(fruits.size());
		
		// 인덱스 사용하여 요소에 접근
		System.out.println(fruits.get(0));
		
		// 요소 수정
		fruits.set(0, "체리");
		System.out.println(fruits);
		
		fruits.remove(1);
		System.out.println(fruits);
		
		// 순회해서 요소 출력
		System.out.println("모든 과일 목록");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// 비우기
		fruits.clear();
		System.out.println(fruits);
	}

}
