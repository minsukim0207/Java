package com.kh.iteratorprac;
import java.util.Iterator;
import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("���");
		fruits.add("����");
		fruits.add("�ٳ���");
		
		Iterator<String> iter = fruits.iterator();
		
		while (iter.hasNext()) {
			String fruit = iter.next();
			System.out.println(fruit);
		}
	}

}
