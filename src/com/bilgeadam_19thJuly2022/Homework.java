package com.bilgeadam_19thJuly2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
 * 
 *  random bir 1 ile 40 değerlerini içeren bir int değer oluşturuyoruz bu değere karşılık gelen şehirin isimini doğru bilip 
 * bilmediğimizi bulalım 3 hakkımız olsun 3 hakta doğru bilemezsek oyun sonlansın
 * 
 * 
 */
public class Homework {

	public static void main(String[] args) {
		int plate_random = randomNumGenerator();
		String city = city(plate_random);
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------------------------------------------------");
		System.out.println("------------------START GAME------------------");
		System.out.println("------------------------------------------------------");
		System.out.println();
		do {
			System.out.print("Guess the city for the following plate number <" + plate_random + "> : ");
			String city_guess = scanner.nextLine();
			if (city_guess.equalsIgnoreCase(city)) {
				System.out.println("You guessed it right. " + plate_random + " is the plate number of " + city + ".");
				count = 3;
			} else {
				count++;
				if (count < 3) {
					System.out.println("Wrong Guess. Try again. (Remaining number of tries: " + (3 - count) + ")");
				} else {
					System.out.println("You could not guess the city. The right answer was " + city + ". You lost!!");
				}

			}
		} while (count != 3);
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println("-------------------END GAME--------------------");
		System.out.println("------------------------------------------------------");
		scanner.close();
	}

	public static int randomNumGenerator() {
		Random rand = new Random();
		int random = rand.nextInt(1, 41);
		return random;
	}

	public static String city(int key) {
		mapCreator();
		String city = mapCreator().get(key);
		return city;
	}

	public static Map<Integer, String> mapCreator() {
		Map<Integer, String> cities = new LinkedHashMap<Integer, String>();
		cities.put(1, "Adana");
		cities.put(2, "Adiyaman");
		cities.put(3, "Afyonkarahisar");
		cities.put(4, "Agrı");
		cities.put(5, "Amasya");
		cities.put(6, "Ankara");
		cities.put(7, "Antalya");
		cities.put(8, "Artvin");
		cities.put(9, "Aydin");
		cities.put(10, "Balikesir");
		cities.put(11, "Bilecik");
		cities.put(12, "Bingöl");
		cities.put(13, "Bitlis");
		cities.put(14, "Bolu");
		cities.put(15, "Burdur");
		cities.put(16, "Bursa");
		cities.put(17, "Canakkale");
		cities.put(18, "Cankiri");
		cities.put(19, "Corum");
		cities.put(20, "Denizli");
		cities.put(21, "Diyarbakir");
		cities.put(22, "Edirne");
		cities.put(23, "Elazig");
		cities.put(24, "Erzincan");
		cities.put(25, "Erzurum");
		cities.put(26, "Eskisehir");
		cities.put(27, "Gaziantep");
		cities.put(28, "Giresun");
		cities.put(29, "Gumushane");
		cities.put(30, "Hakkari");
		cities.put(31, "Hatay");
		cities.put(32, "Isparta");
		cities.put(33, "Mersin");
		cities.put(34, "Istanbul");
		cities.put(35, "Izmir");
		cities.put(36, "Kars");
		cities.put(37, "Kastamonu");
		cities.put(38, "Kayseri");
		cities.put(39, "Kirkareli");
		cities.put(40, "Kirsehir");
		return cities;
	}

}
