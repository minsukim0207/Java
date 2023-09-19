package com.kh.stackmain;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<>();
		
		deque.addFirst("first");
		deque.addLast("last");
		
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		System.out.println(deque.isEmpty());
	}

}
