package com.bilgeadam_13thJune2022;

public class Question9 {

	// fibonachhi sayılarını yazdıran
	// kod parçacığını yazınız 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ilk 11 tanesi

	public static void main(String[] args) {

		int x = 0;
		int y = 1;
		for (int i = 0; i < 11; i++) {
			System.out.print(x + " ");
			int z = x + y;
			x = y;
			y = z;

		}

	}

}
