package com.bilgeadam_20thJune2022;

import java.util.Scanner;

public class Question41 {

	// 1 den 1000 ekadar olan sayıların asal olup olmadığını kontrol eden methodu
	// yazınız
	// method sadece
	// asal olup olmadığını kontrol etsin döngümüzü main methoda kuralım ;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num = scanner.nextInt();
		if (prime_number_control(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
		scanner.close();

	}

	public static boolean prime_number_control(int num) {
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}

		return true;

	}

}
