package com.bilgeadam_20thJune2022;

import java.util.Scanner;

public class Question39 {

	// 4 7 7 7 7
	// 1 4 7 7 7
	// 1 1 4 7 7
	// 1 1 1 4 7
	// 1 1 1 1 4

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		printMatrix();
	}

	public static void printMatrix() {
		int odd_number = check_odd();
		System.out.print("Please enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Please enter the number of columns: ");
		int columns = scanner.nextInt();
		int average = (odd_number + 1) / 2;
		int matrix[][] = new int[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j)
					matrix[i][j] = average;
				else if (i < j)
					matrix[i][j] = odd_number;
				else
					matrix[i][j] = 1;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

	public static int check_odd() {
		System.out.print("Please enter an odd number: ");
		int odd_number = scanner.nextInt();
		while (odd_number % 2 == 0) {
			System.out.print("Invalid entry. Please enter an odd number: ");
			odd_number = scanner.nextInt();
		}
		return odd_number;

	}

}
