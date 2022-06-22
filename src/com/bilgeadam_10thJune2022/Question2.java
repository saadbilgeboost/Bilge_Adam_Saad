package com.bilgeadam_10thJune2022;

import java.util.Scanner;

public class Question2 {

	// amount türk lirası excahangeRate 1 dolar 16.96 tl

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the amount in Turkish Lira................................: TL ");
		double turk_lira = scanner.nextDouble();
		double exchange_rate = 17.30;
		double cents = Math.round(turk_lira * 100 / exchange_rate);
		System.out.println("The dollar amount of TL " + turk_lira + " is equal to USD " + cents / 100 + ".");
		scanner.close();

	}

}
