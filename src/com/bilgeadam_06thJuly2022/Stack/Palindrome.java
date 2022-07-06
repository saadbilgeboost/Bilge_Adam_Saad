package com.bilgeadam_06thJuly2022.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	Stack<Character> stack = new Stack<Character>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a text:");
		String text = scanner.nextLine();

		Palindrome palindrom = new Palindrome();
		palindrom.stack = palindrom.stack(text);

		palindrom.stack.forEach(s -> System.out.println(s));
		if (palindrom.isPalindrome(text)) {
			System.out.println(text + " is a Palindrome.");
		} else {
			System.out.println(text + " is not a Palindrome.");
		}
		scanner.close();

	}

	public Stack<Character> stack(String text) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < text.length(); i++) {
			stack.add(text.charAt(i));
		}
		return stack;

	}

	public boolean isPalindrome(String text) {
		text = text.toLowerCase();
		for (int i = 0; i < text.length() / 2; i++) {

			if (text.charAt(i) != stack.pop()) {
				return false;
			}
		}

		return true;

	}
}
