package com.kh.collectionmain;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List
		List<String> myList = new ArrayList<>();
		myList.add("사과");
		myList.add("바나나");
		myList.add("딸기");
		
		System.out.println("List: ");

		for (String fruit : myList) {
			System.out.println(fruit);
		}
		
		// Set 예제
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(2); // 중복 요소 비허용
		
		for (Integer num : mySet) {
			System.out.println(num);
		}
		
		// Map 예제
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("한국", 1);
		myMap.put("미국", 2);
		myMap.put("일본", 3);
		myMap.put("한국", 4);
		
		for (String country : myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " " + code);
		}
	}
	
}