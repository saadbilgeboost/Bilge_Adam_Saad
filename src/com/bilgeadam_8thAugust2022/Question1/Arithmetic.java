package com.bilgeadam_8thAugust2022.Question1;

public class Arithmetic {
	public int sum(int... num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	public int product(int... num) {
		int product = 1;
		for (int i = 0; i < num.length; i++) {
			product *= num[i];
		}
		return product;
	}

	public double division(int... num) {

		double division = num[0];
		for (int i = 1; i < num.length; i++) {
			division = division / num[i];
		}
		return division;
	}

	public int difference(int... num) {
		int difference = num[0];
		for (int i = 1; i < num.length; i++) {
			difference = difference - num[i];
		}
		return difference;

	}

	public double greater_division(int... num) {

		double division = 1;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > division) {
				division = num[i] / division;
			} else {
				division = division / num[i];
			}
		}
		return division;
	}

	public int positive_difference(int... num) {
		int difference = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > difference) {
				difference = num[i] - difference;
			} else {
				difference -= num[i];
			}
		}
		return difference;

	}

}
