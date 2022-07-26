package com.bilgeadam_26thJuly2022.schoolManagement;

import java.time.LocalDate;
import java.util.Scanner;

public class Utils {
	static Scanner scanner = new Scanner(System.in);

	public static LocalDate stringToLocalDateControl(String query) {

		LocalDate date = null;
		String value = "";
		boolean control = false;
		do {
			System.out.print(query);
			try {
				value = scanner.nextLine();
				date = LocalDate.parse(value);
				control = false;
			} catch (Exception e) {
				System.err.println("Invalid entry.");
				control = true;
			}
		} while (control);
		return date;
	}

	public static double readDouble(String query) {
		double value = 0;
		boolean control = false;
		do {
			System.out.print(query);
			try {
				value = Double.parseDouble(scanner.nextLine());
				control = false;
			} catch (Exception e) {
				System.err.println("Invalid entry. Please enter a Number.");
				control = true;
			}
		} while (control);
		return value;
	}
}
