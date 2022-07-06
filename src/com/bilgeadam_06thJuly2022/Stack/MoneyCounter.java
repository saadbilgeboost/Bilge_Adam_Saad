package com.bilgeadam_06thJuly2022.Stack;

import java.util.Stack;

public class MoneyCounter {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(200);
		stack.add(100);
		stack.push(20);
		stack.push(25);
		stack.add(20);

		// stack.forEach(s -> System.out.println(s));
//		
//			System.out.println(stack.pop());
//		}
		Stack<Integer> stack2 = new Stack<Integer>();
		int total = 0;
		while (!stack.empty()) {
			if (stack.peek() < 100) {
				total += stack.pop();
			} else {
				stack2.add(stack.pop());
			}
		}
		System.out.println(total);
		System.out.println("---------------------");
		stack2.forEach(s -> System.out.println(s));

	}
}
