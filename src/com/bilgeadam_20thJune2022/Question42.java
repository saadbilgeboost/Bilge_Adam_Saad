package com.bilgeadam_20thJune2022;

import java.util.Scanner;

public class Question42 {
	// Obeb Okek ;
	// sayi1 sayi 2
	// obeb(sayi1,sayi2)
	// okek=sayi1*sayi2/obeb;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Please enter the second number: ");
		int num2 = scanner.nextInt();
		System.out.println("The greatest common factor of " + num1 + " and " + num2 + " is " + GCF(num1, num2));
		System.out.println(
				"The least common multiple of " + num1 + " and " + num2 + " is " + (num1 * num2) / GCF(num1, num2));
		scanner.close();
	}

	public static int GCF(int num1, int num2) {
		int mul = 1;

		for (int i = 1; i <= num2 && i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				mul = i;
			}
		}

		return mul;

	}
}
