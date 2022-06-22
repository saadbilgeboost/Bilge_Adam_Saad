package com.bilgeadam_21stJune2022;

import java.util.Scanner;

public class Question46 {
	static Scanner scanner = new Scanner(System.in);
	static int current_year = 2022;

	public static void main(String[] args) {
		System.out.print("Please enter your year of birth: ");
		int birth_year = scanner.nextInt();
		System.out.println("You were born in " + century(birth_year) + "th century.");
		System.out.println("You are " + age(birth_year) + " years old.");
		scanner.close();
	}

	public static int century(int birth_year) {
		int century_num = 0;
		if (birth_year % 1000 == 0) {
			century_num = (birth_year / 100);
		} else {
			century_num = (birth_year / 100) + 1;
		}

		return century_num;
	}

	public static int age(int birth_year) {
		int age = current_year - birth_year;
		return age;
	}

}
