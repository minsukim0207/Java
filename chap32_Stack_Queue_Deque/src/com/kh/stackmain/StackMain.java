package com.kh.stackmain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.size();
		
		stack.contains(1);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.clear();
		stack.empty();
	}

}
