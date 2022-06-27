package com.bilgeadam_27thJune2022.Question3;

public class CustomStringTR {
	static String metin;

	public int uzunluk() {
		return metin.length();
	}

	public String yerine_gecmek(String str1, String str2) {
		return metin.replace(str1, str2);
	}

	public boolean icerir(String str1) {
		return metin.contains(str1);
	}

	public String buyukHarf() {
		return metin.toUpperCase();
	}

	public String kucukHarf() {
		return metin.toLowerCase();
	}

	public char karakterAt(int index) {
		return metin.charAt(index);
	}

	public int indeks(String karakter) {
		return metin.indexOf(karakter);
	}

	public String hepsini_degistir(String str1, String str2) {
		return metin.replaceAll(str1, str2);
	}

	public String altdize(int basla) {

		return metin.substring(basla);
	}

	public String altdize(int basla, int bitir) {

		return metin.substring(basla, bitir);
	}

	public int son_indeks(String karakter) {
		return metin.lastIndexOf(karakter);
	}
}
