package com.bilgeadam_16thJune2022;

public class Question23 {

	// dışarıdan girilen bir değeri , ile ayırıp alt alta yazma

	public static void main(String[] args) {

		String text = "Hayat,kisa,kuslar,ucuyor";
		int index = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') {
				System.out.println(text.substring(index, i));
				index = i + 1;
			}

		}
		System.out.println(text.substring(index));
		System.out.println("*****************************************************************");

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == ',')
				System.out.println();
			else
				System.out.print(text.charAt(i));

		}

	}

}
