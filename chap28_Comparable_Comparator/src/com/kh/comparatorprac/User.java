package com.kh.comparatorprac;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class User implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		if (str1.length() == str2.length()) {
			return 0;
		} else if (str1.length() > str2.length()) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		
		str.add("1");
		str.add("123");
		str.add("12");
		str.add("1234");
		str.add("1234567");
		str.add("12345");
		
		Collections.sort(str, new User());
		
		for (String s : str) {
			System.out.println(s);
		}
	}
}
