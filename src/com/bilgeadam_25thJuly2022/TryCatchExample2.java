package com.bilgeadam_25thJuly2022;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TryCatchExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// intChecker(scanner);
		// dateChecker(scanner);
		boolean control = false;

		do {
			try {
				ageCalculator(intChecker(scanner), dateChecker(scanner));
				control = false;

			} catch (Exception e) {
				System.out.println(e.getMessage());
				control = true;
			} finally {
				scanner.nextLine();
			}

		} while (control);
		scanner.close();
	}

	private static int intChecker(Scanner scanner) throws Exception {

		try {
			System.out.println("Please enter an integer.");
			int num = scanner.nextInt();
			return num;

		} catch (Exception e) {
			throw new Exception("Invalid entry!!");

		} finally {
			scanner.nextLine();
		}

	}

	private static LocalDate dateChecker(Scanner scanner) throws Exception {

		try {
			System.out.println("Please enter a date.");
			LocalDate date = LocalDate.parse(scanner.next());
			return date;
		} catch (Exception e) {
			throw new Exception("The date entered is invalid.");
		}

	}

	private static void ageCalculator(int num, LocalDate date_of_birth) {
		long age = date_of_birth.until(LocalDate.now().minusYears(num), ChronoUnit.YEARS);
		System.out.println("Your age " + num + " years ago was: " + age);
	}
}
