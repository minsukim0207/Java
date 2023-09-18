package com.kh.iteratormain;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
/*
 * Iterator
 * �÷����� �ݺ�(Iterate)�ϸ鼭 ��ҿ� �����ϴµ� ���Ǵ� �������̽�
 * �پ��� �÷��� ����(ArrayList, HashSet, HashMap ��)�� ��� ����
 * �÷����� ��Ҹ� �а� �����ϴµ� ���
 * �÷����� ũ�⳪ ���� ������ ������� ��ҿ� ���� ����
 */
	public static void main(String[] args) {

		// ArrayList ���� �� ��� �߰�
		ArrayList<String> music = new ArrayList<>();
		music.add("�߶��");
		music.add("��");
		music.add("Ʈ��Ʈ");
		
		// Iterator ����
		Iterator<String> iter = music.iterator();
		
		// Iterator ����Ͽ� ��� �ݺ�
		while (iter.hasNext()) {
			String msc = iter.next();
			System.out.println(msc);
		}
		
		iter = music.iterator(); // Iterator �ʱ�ȭ
		while (iter.hasNext()) {
			String msc = iter.next();
			if (msc.equals("Ʈ��Ʈ")) {
				iter.remove();
			}
			System.out.println(msc);
		}
		
		System.out.println("���� �� ���");
		for (String m : music) {
			System.out.println(m);
		}
	}
}