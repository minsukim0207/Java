package com.kh.listarray;
import java.util.List;
import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) {
		
		String[] stringArray = new String[2];
		
		stringArray[0] = "1";
		stringArray[1] = "2";
		
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("1");
		stringList.add("2");
		
		for (String str : stringList) {
			System.out.println(str);
		}
	}

}
