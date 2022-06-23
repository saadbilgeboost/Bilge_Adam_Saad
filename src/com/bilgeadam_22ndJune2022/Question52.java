package com.bilgeadam_22ndJune2022;

public class Question52 {
	String kartTurleri[];
	String kartNumaralari[];

	public static void main(String[] args) {

	}

	public static int[] desteyiOlustur(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		return array;
	}

	public void desteyiGoster(int[] deste, String[] kartNumaralari, String[] kartTurleri) {
		for (int i = 0; i < deste.length; i++) {
			int index = deste[i] / 13;
			int kartindex = deste[i] % 13;
			String kartTuru = kartTurleri[index];
			String kartNumarasi = kartNumaralari[kartindex];

			System.out.println(kartTuru + " " + kartNumarasi);
		}
	}

}
