package com.bilgeadam_17thJune2022;

import java.util.Scanner;

public class Question31 {
	// iki kez üst üste aynı sayı klavyeden girilene kadar girilmiş
	// tüm sayıların ortalamasını bulup ekrana yazdıran
	// (girilen aynı sayının sonuncusu işleme alınmayacaktır)

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double total = 0;
		int count = 0;
		double average = 0;
		boolean check = false;
		System.out.print("Please enter a number: ");
		int num1 = scanner.nextInt();
		total += num1;
		count++;
		while (!check) {
			System.out.print("Please enter another number: ");
			int num2 = scanner.nextInt();
			if (num1 == num2) {
				check = true;
				break;
			} else {
				total += num2;
				count++;
				num1 = num2;
			}
		}
		average = total / count;
		System.out.print("The average of the numbers is: " + average);
		scanner.close();
	}

}
