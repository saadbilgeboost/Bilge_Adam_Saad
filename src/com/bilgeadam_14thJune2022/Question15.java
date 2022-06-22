package com.bilgeadam_14thJune2022;

import java.util.Scanner;

public class Question15 {

	// Girilen sayının 5'in kuvveti olup olmadığını bulan program.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a positive integer..................: ");
		int num = scanner.nextInt();
		boolean check = true;
		if (num == 1)
			check = false;
		else {
			for (int i = 1; num > Math.pow(5, i); i++) {
				if (num % Math.pow(5, i) == 0) {
					check = true;

				} else
					check = false;
			}

		}
		if (check)
			System.out.println(num + " is a power of 5.");
		else
			System.out.println(num + " is not a power of 5.");
		scanner.close();

	}

}
