package com.bilgeadam_13thJune2022;

import java.util.Scanner;

public class Question13 {

	// Girilen sayının istenilen sayıya göre mod işlemini yaptıran

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the divident..................: ");
		int num1 = scanner.nextInt();
		System.out.print("Please enter the divisor...................: ");
		int num2 = scanner.nextInt();

		int remainder = num1 - (num1 / num2) * num2;

		System.out.println("The remainder is " + remainder + ".");
		scanner.close();

	}

}
