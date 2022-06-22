package com.bilgeadam_13thJune2022;

import java.util.Scanner;

public class Question12 {

	/*
	 * 1- dışarıdan girdiğimiz bir sayının Asal sayı olup olmadığını kontrol eden
	 * kod
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a integer......................: ");
		int n = scanner.nextInt();
		boolean check = true;
		if (n < 2) {
			check = false;

		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					check = false;
					break;
				}
			}
			if (check)
				System.out.println(n + " is a prime number.");
			else
				System.out.println(n + " is not a prime number.");

		}
		scanner.close();
	}

}
