package com.kh.arrayListSample;
import java.util.ArrayList;

public class TodoSample {

	public static void main(String[] args) {
		
		ArrayList<String> todoList = new ArrayList<>();
		
		todoList.add("�� �ø���");
		todoList.add("�ǽ����� Ǯ��");
		todoList.add("å �б�");
		System.out.println(todoList);
		System.out.println();
		
		for (String todo : todoList) {
			System.out.println(todo);
		}
		System.out.println();
		
		todoList.set(0, "Git upload");
		todoList.set(1, "Practice");
		System.out.println(todoList);
		System.out.println();
		
		todoList.remove(2);
		System.out.println(todoList);
		System.out.println();
		
		todoList.clear();
		System.out.println(todoList);
		System.out.println();

	}

}
