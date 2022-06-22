package com.bilgeadam_14thJune2022;

import java.util.Scanner;

public class Question18 {
	// Switch case
	// Dışarıdan bir gününü kaçıncı gün olduğuna dair bir sayı giriniz bu sayıya
	// göre gün isimini bize dönsün

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer between 1 and 7...............: ");

		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Entry!!");
			break;
		}
		scanner.close();

	}

}
