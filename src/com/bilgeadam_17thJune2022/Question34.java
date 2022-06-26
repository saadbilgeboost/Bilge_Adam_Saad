package com.bilgeadam_17thJune2022;

public class Question34 {
	// Sehirleri plaka kodlarıyla birlikte bir diziye atayalım daha sonra
	// “Adananın plaka kodu 01” örnek çıktışı gibi

	public static void main(String[] args) {
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		String array[] = sehirler.split(";");

		for (int i = 0; i < array.length; i++) {
			int index = array[i].indexOf("-");

			System.out.println(
					array[i].substring(index + 1) + "'s plate number is " + array[i].substring(0, index) + ".");
		}

	}

}
