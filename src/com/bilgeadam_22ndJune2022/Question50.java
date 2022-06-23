package com.bilgeadam_22ndJune2022;

public class Question50 {
// dizi ogelerini tersine cevirme
	public static void main(String[] args) {
		int arr[] = { 1, 5, 6, 7 };
		tersCevir(arr);

	}

	public static int[] reverse(int array[]) {
		int new_array[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			new_array[i] = array[array.length - 1 - i];
		}
		return new_array;
	}

	public static void tersCevir(int[] array) {
		int j = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;
		}
		for (int i : array) {
			System.out.println(i);
		}

	}

}
