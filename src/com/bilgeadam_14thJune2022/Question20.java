package com.bilgeadam_14thJune2022;

import java.util.Scanner;

public class Question20 {

	// Menü
	// 1 Eğer boşluk varsa ilk boşluktan stringin sonuna kadar olan kısmı başka bir
	// değişkene atayın
	// Ve dışardan bir string girip onunla birleştirin.
	// 2 İçinde kaç tane a ve olduğunu bulunuz

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a text..................: ");
		String text = scanner.nextLine().trim();

		System.out.println("****************MENU*****************");
		System.out.println("1. Dividing from empty space.");
		System.out.println("2. Alphabet count.");
		System.out.print("Please select an option from the menu.");
		int select = scanner.nextInt();

		scanner.nextLine();

		switch (select) {

		case 1:
			int check = text.indexOf(" ");
			if (check != -1) {
				String new_text;
				new_text = text.substring(check + 1, text.length());
				System.out.print("Please enter another text........: ");
				new_text += scanner.nextLine();
				System.out.println(new_text);
			}
			break;
		case 2:
			int count = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == 'a' || text.charAt(i) == 'A')
					count++;
			}
			System.out.println("The character 'a' occurs " + count + " times in the text.");

		default:
			break;
		}
		scanner.close();
	}

}
