package com.kh.genericsPrac;

import java.util.ArrayList;

public class GenericsPrac {

	public static void main(String[] args) {
		GenericsPrac gp = new GenericsPrac();
		gp.prac1();
		
	}
	
	public void prac1() {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("world");
		
		printList(intList);
		printList(strList);
		
	}

	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}
}
