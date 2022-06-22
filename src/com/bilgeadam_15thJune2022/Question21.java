package com.bilgeadam_15thJune2022;

import java.util.Scanner;

public class Question21 {

	// Dışarıdan Bir kelime girin her harfi
	// başına index numarası kullanark alt alta yazdırınız

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a word................: ");
		String word = scanner.nextLine();

		for (int i = 0; i < word.length(); i++) {
			System.out.println(i + " - " + word.charAt(i));
		}
		scanner.close();
	}

}
