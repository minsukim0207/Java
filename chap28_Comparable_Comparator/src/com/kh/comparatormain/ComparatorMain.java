package com.kh.comparatormain;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain implements Comparator<String> {
	
	@Override
	public int compare(String num1, String num2) {
		// 길이가 같으면 0 반환
		if (num1.length() == num2.length()) {
			return 0;
		} else if (num1.length() > num2.length()) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		
		str.add("apple");
		str.add("banana");
		str.add("cherry");
		str.add("add");
		str.add("day");
		str.add("z");
		
		// Comparator 사용해서 문자열 정렬
		Collections.sort(str, new ComparatorMain());
		
		// 정렬된 겨로가 출력
		for (String s : str) {
			System.out.println(s);
		}
	}
}