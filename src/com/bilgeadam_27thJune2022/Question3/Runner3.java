package com.bilgeadam_27thJune2022.Question3;

public class Runner3 {

	public static void main(String[] args) {

		CustomStringTR ifade = new CustomStringTR();
		CustomStringTR.metin = "Bilge Adam Akademi";

		System.out.println(ifade.uzunluk());

		CustomStringTR.metin = ifade.yerine_gecmek("k", "c");

		System.out.println(CustomStringTR.metin);

		System.out.println(ifade.icerir("Ad"));

		System.out.println(ifade.buyukHarf());

		System.out.println(ifade.kucukHarf());

		System.out.println(ifade.karakterAt(4));

		System.out.println(ifade.indeks("l"));

		System.out.println(ifade.hepsini_degistir("i", "a"));

		System.out.println(ifade.altdize(5));

		System.out.println(ifade.altdize(0, 5));

		System.out.println(ifade.son_indeks("m"));
	}

}
