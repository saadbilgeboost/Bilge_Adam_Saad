package com.bilgeadam_16thJune2022;

public class Question27 {
	// dizi deki tüm sayıların toplamı ve
	// bu sayı çiftdir ve bu sayı tekdir şeklinde çıktı alalım.

	public static void main(String[] args) {
		int[] numbers = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		int sum = 0;
		String even = " ";
		String odd = " ";
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			if (numbers[i] % 2 == 0)
				even += numbers[i] + ", ";
			else
				odd += numbers[i] + ", ";
		}
		System.out.println("The sum of the numbers in the list is: " + sum);
		System.out.println("List of even numbers in the list: {" + even + "}");
		System.out.println("List of odd numbers in the list: {" + odd + "}");
	}

}
