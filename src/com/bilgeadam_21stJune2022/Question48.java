package com.bilgeadam_21stJune2022;

import java.util.Scanner;

/*
 * 1.method Dışarıdan girilen harfle başlayan illeri yazdır.
 * 2.method illeri plaka kodları ile yazdıran method 01-Adana,02-Adıyaman,03-Afyon 
 * 3.Girdiğimiz şehrin ismine göre plaka dönen methodu yazalım.
 * 4.İlk harf hariç sesli harfleri silip yazdıran fonksiyon.
 * 5.method bir önceki methoddan dönen Dğerlerin ilk üç harfini alın ve sonuna ... 
 * nokta ekleyin Adn... Ady... gibi
 * 
 *6.method bir önceki methoddan dönen dizide  B ile başlayan illerin başına 1-Blk gibi yazdıralım
/ 7.method ikinci harfi a olanların  ilk değeri ve sadece ilk 3 harfini büyük yazdırın Çankırı->ÇAN
 * 
 * 
 * 
 */
public class Question48 {
	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };
	static String[] vowels = { "a", "e", "i", "o", "u", "ı", "ö", "ü" };

	public static void main(String[] args) {

		// bul_iller();
		// plaka_iller();
		// plaka();
		// plaka_yazdir("Ankara");
		String[] new_array = sesli_harf_silme();
		String[] new_array_B = number_B(new_array);
		for (int i = 0; i < new_array_B.length; i++)
			System.out.println(new_array_B[i]);
		// shorten(new_array);
		String[] new_array_capital = capital_a(iller);
		for (int i = 0; i < new_array_capital.length; i++)
			System.out.println(new_array_capital[i]);

	}

	public static void bul_iller() {
		System.out.print("Please enter an alphabet: ");
		Scanner scanner = new Scanner(System.in);
		String harf = scanner.nextLine().toUpperCase().substring(0, 1);
//		for (int i = 0; i < iller.length; i++) {
//			if (iller[i].startsWith(harf)) {
//				System.out.println(iller[i]);
//			}
		for (String il : iller) {
			if (il.startsWith(harf)) {
				System.out.println(il);
			}
		}
		scanner.close();
	}

	public static void plaka_iller() {
//		for (int i = 0; i < iller.length; i++) {
//			if (i < 9) {
//				System.out.println("0" + (i + 1) + " " + iller[i]);
//			} else
//				System.out.println(i + 1 + " " + iller[i]);
//		}
		int i = 1;
		for (String il : iller) {
			if (i < 10)
				System.out.println("0" + i + " " + il);
			else
				System.out.println(i + " " + il);
			i++;
		}

	}

	public static void plaka() {
		System.out.print("Please enter the city whose plate number you want: ");
		Scanner scanner = new Scanner(System.in);
		String il = scanner.nextLine();
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].equalsIgnoreCase(il)) {
				if (i < 9)
					System.out.println("The plate number for " + il + " is 0" + (i + 1) + ".");
				else
					System.out.println("The plate number for " + il + " is " + (i + 1) + ".");

			}
		}
		scanner.close();

	}

	public static void plaka_yazdir(String... il) {
		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < il.length; j++) {
				if (iller[i].equalsIgnoreCase(il[j].trim())) {
					if (i < 9)
						System.out.println("The plate number for " + iller[i] + " is 0" + (i + 1) + ".");
					else
						System.out.println("The plate number for " + iller[i] + " is " + (i + 1) + ".");

				}

			}
		}
	}

	public static String[] sesli_harf_silme() {
		String[] new_iller = new String[iller.length];
		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (iller[i].contains(vowels[j])) {
					new_iller[i] = iller[i].replace(vowels[j], "");
				} else
					new_iller[i] = iller[i];
			}

		}
		return new_iller;
	}

	public static void shorten(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 2)
				System.out.println(array[i].substring(0, 3) + "...");
			else
				System.out.println(array[i] + "...");
		}
	}

	public static String[] number_B(String[] new_iller) {
		String[] new_iller_B = new String[new_iller.length];
		int k = 1;
		for (int i = 0; i < new_iller.length; i++) {
			if (new_iller[i].startsWith("B")) {
				new_iller_B[i] = k + "-" + new_iller[i];
				k++;

			} else {
				new_iller_B[i] = new_iller[i];
			}
		}

		return new_iller_B;
	}

	public static String[] capital_a(String[] iller) {
		String[] new_iller_capital = new String[iller.length];
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].substring(1, 2).equals("a")) {
				new_iller_capital[i] = iller[i].substring(0, 3).toUpperCase();
			} else {
				new_iller_capital[i] = iller[i];
			}
		}
		return new_iller_capital;
	}
}
