package com.kh.example.practice.advancedfor;
import java.util.ArrayList;
import java.util.List;

public class Rainbow {

	public static void main(String[] args) {
		
		ArrayList<String> rainbow = new ArrayList<String>();
		
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		
		System.out.println(rainbow);
		System.out.println();
		
		System.out.println("����");
		rainbow.set(1, "��");
		rainbow.set(3, "����");
		rainbow.set(5, "�׸�");
		System.out.println(rainbow);
		System.out.println();
		
		System.out.println("�߰�");
		rainbow.add("���ο�");
		rainbow.add("�����Ķ�");
		System.out.println(rainbow);
		System.out.println();
		
		System.out.println(rainbow.size());
		
		for (String color : rainbow) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		System.out.println(rainbow.get(0) + " " + rainbow.get(4) + " " + rainbow.get(6));
		
	}

}
