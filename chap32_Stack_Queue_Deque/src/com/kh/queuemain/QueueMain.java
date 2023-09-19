package com.kh.queuemain;
import java.util.LinkedList;

import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("apple");
		queue.offer("banana");
		queue.offer("cherry");
		
		// 큐에서 요소 추출 및 출력
		String removedElement = queue.poll(); // 큐에서 apple 제거하고 반환
		System.out.println(removedElement);
		
		removedElement = queue.poll(); // banana 제거하고 반환
		
		// 큐의 Front 요소 확인
		String frontElement = queue.peek(); // Front 요소 cherry 반환
		
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
