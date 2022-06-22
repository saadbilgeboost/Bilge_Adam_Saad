package com.bilgeadam_10thJune2022;

import java.util.Scanner;

public class Question1 {

	// Bir ürünün satış fiyatının içinde 18% KDV ve 15% kar olduğunu biliyoruz.
	// Ürünün ham fiyatı hesaplayın.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the Retail price of the product...................: TL ");
		double retail_price = scanner.nextDouble();
		double price_withouttax = retail_price / 1.18;
		double raw_price = price_withouttax / 1.15;
		double rounded_price_kurus = Math.round(raw_price * 100);

		System.out.println("The Raw price of the product is.....................: TL " + rounded_price_kurus / 100);
		scanner.close();
	}

}
