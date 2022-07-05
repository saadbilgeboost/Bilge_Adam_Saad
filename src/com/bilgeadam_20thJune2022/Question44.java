package com.bilgeadam_20thJune2022;

import java.util.Scanner;

public class Question44 {
	/*
	 * System.out.println("==Hesap makinesi===\n"); System.out.println("1- Topla");
	 * System.out.println("2- Çıkar"); System.out.println("3- Çarp");
	 * System.out.println("4- Böl"); System.out.println("0- Çıkış");
	 * System.out.println("Bir işlem Seçiniz");
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		do {
			System.out.println("=====Calculator=====");
			System.out.println("1-) Sum");
			System.out.println("2-) Difference");
			System.out.println("3-) Product");
			System.out.println("4-) Division");
			System.out.println("0-) Quit");
			System.out.print("Please select one of the options from above: ");
			int input = scanner.nextInt();
			System.out.print("Please enter the first number: ");
			int num1 = scanner.nextInt();
			System.out.print("Please enter the second number: ");
			int num2 = scanner.nextInt();
			switch (input) {
			case 1:
				System.out.println("Sum = " + sum(num1, num2));
				System.out.print("Please enter the a number: ");
				break;
			case 2:
				System.out.println("Difference = " + difference(num1, num2));
				break;
			case 3:
				System.out.println("Product = " + product(num1, num2));
				break;
			case 4:
				System.out.println("Division = " + division(num1, num2));
				break;
			case 0:
				check = false;
				break;
			default:
				break;
			}
		} while (check);
	}

	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static int difference(int num1, int num2) {
		int difference = num1 - num2;
		return difference;
	}

	public static int product(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}

	public static double division(int num1, int num2) {
		double division = (double) num1 / num2;
		return division;
	}

}
