package com.bilgeadam_17thJune2022;

public class Question36 {
	// Tek sayıları ayrı bir diziye yazdıran kod
	public static void main(String[] args) {

		int count = 0;
		int[][] matrix = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };
		int[] odd_numbers = new int[matrix.length * matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] % 2 != 0) {
					odd_numbers[count] = matrix[i][j];
					count++;
				}

			}

		}
		for (int i = 0; i < count; i++) {
			System.out.println(odd_numbers[i]);
		}

	}

}
