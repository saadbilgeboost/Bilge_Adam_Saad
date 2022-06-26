package com.bilgeadam_16thJune2022;

public class Question29 {
	// bir dizide en büyük ikinci sayıyı bulma
	public static void main(String[] args) {
		int[] numbers = { 0, 120, 5, 85, -256, 16, 1258, 240, 81, 14 };
		int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max1) {
				max2 = max1;
				max1 = numbers[i];
			} else if (numbers[i] > max2) {
				max2 = numbers[i];
			}
		}
		System.out.println("The second largest number in the array is: " + max2);
	}

}
