package com.bilgeadam_13thJune2022;

import java.util.Scanner;

public class Question7 {

	// Girilen rakamın basamakları toplamı

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer.......................: ");
		int num = scanner.nextInt();
		int sum = 0;
		while (num >= 1 || num <= -1) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println("The sum of the digits of the integer is: " + sum + ".");
		scanner.close();
	}

}
