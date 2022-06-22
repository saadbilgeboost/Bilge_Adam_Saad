package com.bilgeadam_14thJune2022;

import java.util.Scanner;

public class Question17 {
	// Klavyeden girilen 0 ile 100 arasında 100 dahil
	// 5 adet sayıdan en büyük ve en küçük olanı bulup ekrana yazan programın kod
	// parçacığı

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while (count < 5) {
			System.out.print("Please enter a number between 0 and 100 included.......................: ");
			int num = scanner.nextInt();
			if (num >= 0 && num <= 100) {
				if (num > max)
					max = num;
				if (num < min)
					min = num;
				count++;
			} else {
				System.out.println("Invalid entry.");
			}

		}
		System.out.println("The maximum is " + max + ".");
		System.out.println("The minimum is " + min + ".");
		scanner.close();
	}
}
