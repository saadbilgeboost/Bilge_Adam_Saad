package com.bilgeadam_14thJune2022;

import java.util.Scanner;

public class Question16 {

	// Mükemmel sayı=kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit
	// olan sayı
	// 6=1+2+3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a positive integer...............: ");
		int num = scanner.nextInt(), sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (num == sum)
			System.out.println(num + " is a Perfect number.");
		else
			System.out.println(num + " is not a Perfect number.");

		scanner.close();

	}

}
