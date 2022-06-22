package com.bilgeadam_16thJune2022;

import java.util.Scanner;

public class Question26 {
	// Java’da dizideki bir öğeyi arama

	public static void main(String[] args) {

		String[] country = { "Turkey", "Japan", "Mongolia", "France", "Denmark" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a country name.................: ");
		String countryString = scanner.nextLine();
		boolean control = false;
		for (int i = 0; i < country.length; i++) {
			if (country[i].equalsIgnoreCase(countryString)) {
				control = true;
				break;
			}
		}
		if (control)
			System.out.println("The country entered found in the list.");
		else
			System.out.println("The country entered not found in the list.");
		scanner.close();

	}

}
