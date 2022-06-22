package com.bilgeadam_13thJune2022;

import java.util.Scanner;

public class Question3 {

	//	* * * * * 
	//	*       * 
	//	*       * 
	//	*       * 
	//	* * * * * 

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the length of the side of the square................................: ");
		int n = scanner.nextInt();
		char character = '*';
		for (int i = 1; i <= n * n; i++) {
			if (i <= n || i > n * (n - 1) || i % n == 1 || i % n == 0) {
				System.out.print(character + " ");
			} else
				System.out.print("  ");
			if (i % n == 0)
				System.out.println();

		}
		scanner.close();
	}

}
