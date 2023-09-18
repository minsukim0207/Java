package com.kh.comparatormain;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain implements Comparator<String> {
	
	@Override
	public int compare(String num1, String num2) {
		// ���̰� ������ 0 ��ȯ
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
		
		// Comparator ����ؼ� ���ڿ� ����
		Collections.sort(str, new ComparatorMain());
		
		// ���ĵ� �ܷΰ� ���
		for (String s : str) {
			System.out.println(s);
		}
	}
}