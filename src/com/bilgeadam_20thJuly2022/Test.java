package com.bilgeadam_20thJuly2022;

import java.util.Scanner;

public class Test {

	public void productBuilder() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the name of the product: ");
		String nameString = scanner.nextLine();
		System.out.println("Please enter the price of the product in $: ");
		double price = scanner.nextDouble();
		scanner.nextLine();

	}
}
