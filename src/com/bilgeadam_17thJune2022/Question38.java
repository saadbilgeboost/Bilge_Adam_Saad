package com.bilgeadam_17thJune2022;

import java.util.Scanner;

public class Question38 {
	// Türkçe karakterleri İngilizce karaktere çevirme
	public static void main(String[] args) {
		String[] englishCharacter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkishCharacter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("===Please enter a text===");
		String text = scanner.nextLine();

		for (int i = 0; i < turkishCharacter.length; i++)
			text = text.replace(turkishCharacter[i], englishCharacter[i]);
		System.out.println("======Updated text======");
		System.out.println(text);
		scanner.close();
	}

}
