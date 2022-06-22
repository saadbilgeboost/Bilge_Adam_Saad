package com.bilgeadam_21stJune2022;

import java.util.Random;
import java.util.Scanner;

public class Question47 {

	public static void main(String[] args) {
		System.out.println("Average: " + average_calculator());
	}

	public static double average_calculator() {
		Scanner scanner = new Scanner((System.in));
		System.out.print("Please enter the length of the array: ");
		int length_array = scanner.nextInt();
		double[] array = new double[length_array];
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			double num = create_num();
			array[i] = num;
			total += num;
			System.out.println(num);
		}
		double average = total / length_array;
		scanner.close();
		return average;

	}

	public static double create_num() {
		Random random = new Random();
		return random.nextInt(500);
	}

}
