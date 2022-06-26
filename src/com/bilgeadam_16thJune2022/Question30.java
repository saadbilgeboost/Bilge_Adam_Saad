package com.bilgeadam_16thJune2022;

public class Question30 {
	// bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngü
	// sonlansın yoksa false yazdıralım ;
	public static void main(String[] args) {
		int[] numbers = { 2, -256, 16, 1258, 5, 2 };
		boolean repeat = false;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i + 1] && numbers[i] == 2) {
				repeat = true;
				break;
			}
		}
		System.out.println(repeat);
	}
}
