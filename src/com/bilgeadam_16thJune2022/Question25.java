package com.bilgeadam_16thJune2022;

public class Question25 {

	public static void main(String[] args) {
		// dizide en büyük ve en küçük öğeyi bulma

		int[] numbers = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}

}
