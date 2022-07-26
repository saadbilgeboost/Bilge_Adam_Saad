package com.bilgeadam_26thJuly2022.Example1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		negativeIntegerException2();
		try {
			negativeIntegerException();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public static void negativeIntegerException() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Please enter an integer: ");
			int num = scanner.nextInt();
			if (num < 0) {

				throw new NegativeIntegerException("The value cannot be less than 0.");

			}
		}
	}

	public static void negativeIntegerException2() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Please enter an integer: ");
			int num = scanner.nextInt();
			if (num < 0) {
				try {
					throw new NegativeIntegerException("The value cannot be less than 0.");
				} catch (NegativeIntegerException e) {
					System.err.println(e.toString());
				}

			}
		}
	}

}
