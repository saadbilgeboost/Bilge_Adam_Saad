package com.bilgeadam_25thJuly2022;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		String[] array = { "a", "10", "bc", null, "20" };
		getElement(array);
		addIntegers(array);
	}

	private static void getElement(String[] array) {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		do {
			System.out.println("Please enter an index of the element you want to see.");
			try {
				int index = scanner.nextInt();
				System.out.println((index + 1) + ". element of the array is: " + array[index]);
				check = false;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println(e.toString());
				check = true;
			} catch (InputMismatchException e2) {
				System.err.println(e2.toString());
				System.out.println("Please enter an Integer.");
				check = true;
			}
		} while (check);
		scanner.close();
	}

	private static void addIntegers(String[] array) {
		int countError = 0;
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			try {
				if (array[i] == null) {
					throw new Exception("One of the element in the array is 'null'.");
				} else {
					total += Integer.parseInt(array[i]);
				}
			} catch (NumberFormatException e) {
				countError++;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				countError++;
				e.printStackTrace();
			}
		}
		System.out.println("Total of integers in the array is: " + total);
		System.out.println("Number of errors: " + countError);
	}

}
