package com.bilgeadam_20thJune2022;

import java.util.Scanner;

public class Question43 {
	// Dışardan kaç sayı gireceksiniz 2 ,3
	// iki tane toplama metodu eğer 2 sayı birtanseini çalıştırısın eğer
	// 3 sayı girmisse diğerini çalıştırsın.
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean check = false;
		while (!check) {
			System.out.print("Please enter the number of integers you will be entering (2 or 3): ");
			int num_int = scanner.nextInt();
			if (num_int == 2) {
				sum_two();
				check = true;
			} else if (num_int == 3) {
				sum_three();
				check = true;
			} else {
				System.out.print("Invalid entry. Please try again.");
				System.out.println();
			}
		}

	}

	public static void sum_two() {

		System.out.print("Please enter the first integer: ");
		int num1 = scanner.nextInt();
		System.out.print("Please enter the second integer: ");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		System.out.print("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
	}

	public static void sum_three() {

		System.out.print("Please enter the first integer: ");
		int num1 = scanner.nextInt();
		System.out.print("Please enter the second integer: ");
		int num2 = scanner.nextInt();
		System.out.print("Please enter the third integer: ");
		int num3 = scanner.nextInt();
		int sum = num1 + num2 + num3;
		System.out.print("The sum of " + num1 + ", " + num2 + " and " + num3 + " is " + sum + ".");
	}

}
