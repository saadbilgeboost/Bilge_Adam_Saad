package com.bilgeadam_15thJune2022;

import java.util.Scanner;

public class Question22 {

	/*
	 * Menu 1-Dışarıdan bir kelime girilsin eğer kelimemizin için de 'a' harfi varsa
	 * kaç tane olduğunu ve index numaralarını yazdırın.
	 * 
	 * 
	 * 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
	 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
	 * içerisinde o harf varsa değiştirsin
	 * 
	 *
	 * 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
	 * olmadığını bulunuz(kek,iki,kabak)
	 * 
	 * 
	 * 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
	 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
	 * açıldığını düşünün elimizde) a lar bir sayfa b ler bir sayfa c ler bir sayfa
	 * gibi düşünelim diğer harfle başlayanlar için ise ayrı bir sayfa düşünelim
	 * girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç sayfa oluğunu
	 * ekrana yazdıralım.
	 * 
	 * 5- 4.sorunun 2.yöntemi
	 * 
	 * 
	 * 
	 * 0-Çıkış
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean again = true;
		while (again) {
			System.out.println();
			System.out.println("*******MENU*******");
			System.out.println(
					"1-) Count number of times character 'a' occurs in the text and write the index where it occurs.");
			System.out.println("2-) Replace a character in the text.");
			System.out.println("3-) Reverse the text entered.");
			System.out.println(
					"4-) Enter 5 words. Check whether the words start with a, b, or c. Count number of pages.");
			System.out.println("5-) Enter 0 to exit");
			int key = scanner.nextInt();
			scanner.nextLine();

			switch (key) {

			case 1:
				System.out.print("Please enter a word...........................: ");
				String word = scanner.nextLine().trim().toLowerCase();
				int count = 0;
				String indexNo = " ";
				if (word.contains("a")) {
					System.out.println("Indexes of character 'a' are as follows:");
					for (int i = 0; i < word.length(); i++) {
						if (word.charAt(i) == 'a') {
							count++;
							indexNo += i + ", ";
						}
					}
					System.out.println("The character 'a' occurs " + count + " times in the text.");
					System.out.println("The indexes of the character 'a' are as follows: " + "{" + indexNo + "}");
				} else
					System.out.println("The " + word + " does not contain the character 'a'.");

				break;

			case 2:
				System.out.println("Please enter a word.........................: ");
				word = scanner.nextLine();
				System.out.print(
						"Please enter the character you want to replace (Please enter only one character. Any character entered after the first character would not be considered.): ");
				String string1 = scanner.nextLine();
				System.out.print(
						"Please enter the character you want to replace with (Please enter only one character. Any character entered after the first character would not be considered.): ");
				String string2 = scanner.nextLine();
				if (word.contains(string1)) {
					word = word.replace(string1.charAt(0), string2.charAt(0));
				} else
					System.out.println("The character entered does not exist in the word you entered.");

				System.out.println(word);
				break;

			case 3:
				System.out.println("Please enter a word.........................: ");
				word = scanner.nextLine();
				word = word.toLowerCase();
				String new_word = " ";
				for (int i = word.length() - 1; i >= 0; i--) {
					new_word = new_word + word.charAt(i);
				}
				System.out.println(new_word.trim());
				if (word.equals(new_word))
					System.out.println(word + " is a Palindrom.");
				else {
					System.out.println(word + " is not a Palindrom.");
				}
				break;

			case 4:
				String page = "";
				count = 5;
				String value;

				do {
					System.out.println("Enter a word.");
					value = scanner.nextLine();
					value = value.toLowerCase();

					if (value.startsWith("a")) {
						if (!page.contains("a")) {
							page += "a";
						}

					} else if (value.startsWith("b")) {
						if (!page.contains("b")) {
							page += "b";

						}
					} else if (value.startsWith("c")) {
						if (!page.contains("c")) {
							page += "c";

						}

					} else {
						if (!page.contains("x")) {
							page += "x";

						}

					}
					count--;

				}

				while (count > 0);

				System.out.println("Number of pages: " + page.length());
				break;

			case 0:
				again = false;

			default:
				System.out.println("Invalid entry. Try again.");
				break;

			}

		}
		scanner.close();
	}
}
