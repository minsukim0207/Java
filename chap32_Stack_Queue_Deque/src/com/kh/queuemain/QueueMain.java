package com.kh.queuemain;
import java.util.LinkedList;

import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("apple");
		queue.offer("banana");
		queue.offer("cherry");
		
		// ť���� ��� ���� �� ���
		String removedElement = queue.poll(); // ť���� apple �����ϰ� ��ȯ
		System.out.println(removedElement);
		
		removedElement = queue.poll(); // banana �����ϰ� ��ȯ
		
		// ť�� Front ��� Ȯ��
		String frontElement = queue.peek(); // Front ��� cherry ��ȯ
		
		int size = queue.size();
		System.out.println(size);
		
		/*
		while (!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
		*/
	}

}
