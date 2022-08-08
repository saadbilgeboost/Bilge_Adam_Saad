package com.bilgeadam_8thAugust2022.Question1;

import java.util.Scanner;

import com.bilgeadam_27thJune2022.Question1.Area_Calculator;
import com.bilgeadam_27thJune2022.Question1.Arithmetic;

public class Runner {
	public static void main(String[] args) {
		// Question part (a)
		Arithmetic arithmetic = new Arithmetic();
		System.out.println(arithmetic.sum(1, 2, 3, 45, 64, 34));
		System.out.println(arithmetic.difference(9, 5, 8, 4)); // bu method sonraki sayidan onceki sayiyi cikartiyor
		System.out.println(arithmetic.positive_difference(9, 5, 8, 4));// Bu method her seferinde buyuk sayidan kucuk
																		// sayiyi cikartiyor.
		System.out.println(arithmetic.product(3, 5, 2));
		System.out.println(arithmetic.division(4, 6, 8, 2));// bu method onceki sayiyi sonraki sayidan boluyor yani
															// ((4/6)/8)/2
		System.out.println(arithmetic.greater_division(4, 6, 8, 2));// Bu methodta her seferinde buyuk sayiyi kucuk
																	// sayidan boluyor
		System.out.println("--------------------------------------------");
		// Question 1 part (b)
		Scanner scanner = new Scanner(System.in);
		Area_Calculator area_Calculator = new Area_Calculator();
		System.out.print("Please enter the number of sides (3 or 4): ");
		int sides = scanner.nextInt();
		if (sides == 3) {
			System.out.print("Please enter the length of the base of the triangle: ");
			double base = scanner.nextInt();
			System.out.print("Please enter the height of the triangle: ");
			double height = scanner.nextInt();
			System.out.print("The area of the triangle is: " + area_Calculator.area_triangle(base, height) + " units.");
		} else if (sides == 4) {
			System.out.print("Please enter the length of the base of the triangle: ");
			double length = scanner.nextInt();
			System.out.print("Please enter the height of the triangle: ");
			double breadth = scanner.nextInt();
			System.out.print(
					"The area of the triangle is: " + area_Calculator.area_rectangle(length, breadth) + " units.");
		} else {
			System.out.println("Invalid entry!!");
		}
		scanner.close();
	}
}
