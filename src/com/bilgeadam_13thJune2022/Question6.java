package com.bilgeadam_13thJune2022;

public class Question6 {

	public static void main(String[] args) {
		// 1den başlayarak sayıları toplayalım sayıların
		// toplamı 50 den büyük olana kadar döngümüz çalışsın

		int sum = 0;
		for (int i = 0; sum < 50; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
