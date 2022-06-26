package com.bilgeadam_17thJune2022;

import java.util.Scanner;

public class Question35 {
	/*
	 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3 katı
	 * ise bilge 5 ise adam hem3 ve hem 5 ise bilgeadam yazdıralım int start=2; int
	 * end=22; 1,2,bilge,4,adam,6.......14,bilgeadam
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the starting number: ");
		int start = scanner.nextInt();
		System.out.print("Please enter the last number: ");
		int end = scanner.nextInt();

		for (int i = start; i < end; i++) {
			if (i % 15 == 0) {
				System.out.println("bilgeadam");
			} else if (i % 5 == 0) {
				System.out.println("adam");
			} else if (i % 3 == 0) {
				System.out.println("bilge");
			} else {
				System.out.println(i);
			}
		}
		scanner.close();

	}

}
