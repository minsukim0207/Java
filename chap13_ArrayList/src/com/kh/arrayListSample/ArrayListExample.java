package com.kh.arrayListSample;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// �� ArrayList ����
		ArrayList<String> fruits = new ArrayList<>();
		
		// ��� �߰�
		fruits.add("���");
		System.out.println(fruits);
		
		fruits.add("�ٳ���");
		System.out.println(fruits);
		
		fruits.add("����");
		System.out.println(fruits);
		
		// ��� ���� Ȯ��
		System.out.println(fruits.size());
		
		// �ε��� ����Ͽ� ��ҿ� ����
		System.out.println(fruits.get(0));
		
		// ��� ����
		fruits.set(0, "ü��");
		System.out.println(fruits);
		
		fruits.remove(1);
		System.out.println(fruits);
		
		// ��ȸ�ؼ� ��� ���
		System.out.println("��� ���� ���");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// ����
		fruits.clear();
		System.out.println(fruits);
	}

}
