package com.bilgeadam_13thJune2022;

import java.util.Scanner;

public class Question10 {

	// Klavyeden 0 girilinceye kadar sayı okunmaya devam edilecektir.0 girildiğinde
	// girilen sayıların toplamı ve ortalamasını

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double sum = 0, average = 0, num;
		int count = 0, i = 1;
		do {
			System.out.print("Please enter an integer..........: ");
			num = scanner.nextDouble();
			sum += num;
			average = sum / i;
			count++;
			i = count - i;

		} while (num != 0);

		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);

		scanner.close();

	}

}
