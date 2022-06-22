package com.bilgeadam_14thJune2022;

import java.util.Scanner;

public class Question19 {

	// Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
	// burc hesabı yapan program

	// ♈ Aries (Ram): March 21–April 19
	//
	// ♉ Taurus (Bull): April 20–May 20
	//
	// ♊ Gemini (Twins): May 21–June 21
	//
	// ♋ Cancer (Crab): June 22–July 22
	//
	// ♌ Leo (Lion): July 23–August 22
	//
	// ♍ Virgo (Virgin): August 23–September 22
	//
	// ♎ Libra (Balance): September 23–October 23
	//
	// ♏ Scorpius (Scorpion): October 24–November 21
	//
	// ♐ Sagittarius (Archer): November 22–December 21
	//
	// ♑ Capricornus (Goat): December 22–January 19
	//
	// ♒ Aquarius (Water Bearer): January 20–February 18
	//
	// ♓ Pisces (Fish): February 19–March 20

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the month your were born in..............: ");
		int month = scanner.nextInt();
		System.out.print("Please enter the day you were born in...............: ");
		int day = scanner.nextInt();

		switch (month) {
		case 1:
			if (day < 20)
				System.out.println("Your zodiac sign is Capricorn.");
			else
				System.out.println("Your zodiac sign is Aquarius.");

			break;
		case 2:
			if (day < 19)
				System.out.println("Your zodiac sign is Aquarius.");
			else
				System.out.println("Your zodiac sign is Pisces.");

			break;
		case 3:
			if (day < 21)
				System.out.println("Your zodiac sign is Pisces.");
			else
				System.out.println("Your zodiac sign is Aries.");

			break;
		case 4:
			if (day < 20)
				System.out.println("Your zodiac sign is Aries.");
			else
				System.out.println("Your zodiac sign is Tauras.");

			break;
		case 5:
			if (day < 21)
				System.out.println("Your zodiac sign is Tauras.");
			else
				System.out.println("Your zodiac sign is Gemini.");

			break;
		case 6:
			if (day < 22)
				System.out.println("Your zodiac sign is Gemini.");
			else
				System.out.println("Your zodiac sign is Cancer.");

			break;
		case 7:
			if (day < 23)
				System.out.println("Your zodiac sign is Cancer.");
			else
				System.out.println("Your zodiac sign is Leo.");

			break;
		case 8:
			if (day < 23)
				System.out.println("Your zodiac sign is Leo.");
			else
				System.out.println("Your zodiac sign is Virgo.");

			break;
		case 9:
			if (day < 23)
				System.out.println("Your zodiac sign is Virgo.");
			else
				System.out.println("Your zodiac sign is Libra.");

			break;
		case 10:
			if (day < 24)
				System.out.println("Your zodiac sign is Libra.");
			else
				System.out.println("Your zodiac sign is Scorpio.");

			break;
		case 11:
			if (day < 22)
				System.out.println("Your zodiac sign is Scorpio.");
			else
				System.out.println("Your zodiac sign is Sagittarius.");

			break;
		case 12:
			if (day < 22)
				System.out.println("Your zodiac sign is Sagittarius.");
			else
				System.out.println("Your zodiac sign is Capricorn.");

			break;

		default:
			System.out.println("Invalid entry!!");
			break;
		}
		scanner.close();

	}

}
