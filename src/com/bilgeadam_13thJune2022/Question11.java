package com.bilgeadam_13thJune2022;

public class Question11 {

	// 0 dan 100 e kadar olan sayılarda Çift Sayıların toplamının,
	// tek sayıların toplamına oranı,

	public static void main(String[] args) {

		double sum_even = 0;
		double sum_odd = 0;
		for (int i = 1; i < 100; i++) {

			if (i % 2 == 0)
				sum_even += i;
			else
				sum_odd += i;

		}
		System.out.println("The ratio of sum of even numbers to odd numbers less than 100 is " + sum_even / sum_odd);

	}

}
