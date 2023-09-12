package com.kh.linkedlistsample;
import java.util.List;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {

		List<String> lList = new LinkedList<>();
		
		lList.add("1");
		lList.add("2");
		lList.add("3");
		System.out.println(lList);
		
		lList.remove(0);
		System.out.println(lList);
		
		LinkedList<Integer> intList = new LinkedList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println(intList);
		
		intList.remove(0);
		System.out.println(intList);
	}

}
