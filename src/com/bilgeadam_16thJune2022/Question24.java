package com.bilgeadam_16thJune2022;

import java.util.Scanner;

public class Question24 {

	/*
	 * 
	 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
	 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
	 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
	 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
	 * işlemler yazdıralım 2000ile bitiyorsa kıta içi işelmeler ve OTH yerine Ki
	 * 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200200…
	 * 
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the IBAN number......................: ");
		String iBANString = scanner.nextLine().toUpperCase();

		if (iBANString.contains("TR")) {
			String bank = switch (iBANString.substring(iBANString.length() - 4)) {

			case "5001" -> "Ziraat Bank";

			case "5002" -> "Garanti Bank";

			case "5003" -> "Is Bank";

			default -> " ";
			};
			System.out.println("Domestic Transfer.");
			System.out.println(bank);
		} else if (iBANString.contains("OTH")) {
			String new_iBANString;
			if (iBANString.substring(iBANString.length() - 4) == "2000") {
				System.out.println("Inland Transaction");
				new_iBANString = iBANString.replace("OTH", "IN");
				new_iBANString = new_iBANString.substring(0, iBANString.length() - 5) + "200200";
				System.out.println(new_iBANString);
			} else {
				new_iBANString = iBANString.replace("OTH", "OUT");
				new_iBANString = new_iBANString.substring(0, iBANString.length() - 5) + "200200";
			}
		} else
			System.out.println("IBAN number entered is invalid.");
		scanner.close();
	}
}
