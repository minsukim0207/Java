package com.kh.practice;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		// pm.stackPrac();
		pm.queuePrac();
	}
	
	public void stackPrac() {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.contains(6));
		
		stack.clear();
		
		System.out.println(stack.empty());
	}
	
	public void queuePrac() {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		
		System.out.println(queue.size());
		
		queue.clear();
		
		System.out.println(queue.isEmpty());
	}
}