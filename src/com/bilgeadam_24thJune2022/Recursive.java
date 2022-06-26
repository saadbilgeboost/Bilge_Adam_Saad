package com.bilgeadam_24thJune2022;

public class Recursive {

	public static void main(String[] args) {
		System.out.println(sum(1));
		System.out.println(factorial(5));
		System.out.println(take_power(5, 3));
	}

	public static int sum(int num) {
		if (num < 1) {
			return 0;
		} else {
			return num + sum(num - 1);
		}
	}

	public static int factorial(int num) {
		if (num > 1) {
			return num * factorial(num - 1);
		} else {
			return 1;
		}
	}

	public static int take_power(int base, int power) {
		if (power == 0) {
			return 1;
		} else {
			return base * take_power(base, power - 1);
		}
	}

	public static int sum_array(int[] array, int index) {
		if (index < 0) {
			return 0;
		} else {
			return array[index] + sum_array(array, index - 1);
		}
	}
}
