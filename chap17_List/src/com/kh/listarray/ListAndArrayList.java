package com.kh.listarray;
import java.util.List;
import java.util.ArrayList;

public class ListAndArrayList {

	public static void main(String[] args) {

		int[] myArray = new int[5];
		myArray[0] = 10;
		
		List<Integer> myList = new ArrayList<>();
		myList.add(10);
		int value = myList.get(0);
		myList.remove(0);
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("첫 번째");
		arrayList.add("두 번째");
		String value2 = arrayList.get(0);
		arrayList.remove(1);
	}

}
