package com.bilgeadam_13thJune2022;

import java.util.Scanner;

public class Question14 {
	// Girilen sayının, kaçıncı Basamak da oluduğu (1ler,10lar,100ler gibi ) o
	// basmak daki basamak değerini (1ler basamağı: 5 ,10 lar basmağı :3 gibi)
	// yazdıran
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer..................: ");
		int num = scanner.nextInt();
		int temp = num;
		int i = 1;
		int digit = 0;

		while (temp > 1 || temp < -1) {

			System.out.println("The " + i + "s place of " + num + " is: " + temp % 10);
			temp /= 10;
			i *= 10;
			digit++;

		}
		System.out.println(num + " is a " + digit + " digit number.");
		scanner.close();

	}

}
