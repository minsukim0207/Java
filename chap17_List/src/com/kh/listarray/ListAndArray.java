package com.kh.listarray;
import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
	
	public static void main(String[] args) {
		ListArray1();
		ListAndArray laa = new ListAndArray();
		laa.ListArray2();
		
	}
	
	public static void ListArray1() {
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		
		System.out.println("Array 요소: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
	
	public void ListArray2() {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		System.out.println("List 요소: ");
		for (int num : intList) {
			System.out.println(num);
		}
	}

}
