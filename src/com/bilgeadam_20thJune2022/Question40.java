package com.bilgeadam_20thJune2022;

public class Question40 {
	// int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
	// {false,false,true,false,false,true,false,false}

	public static void main(String[] args) {
		int[] array = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		boolean[] control = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {
			if (control[i] == true)
				continue;
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					control[j] = true;
					count++;
				}

			}
			if (count > 1) {
				System.out.println(array[i] + " occurs " + count + " times.");
			}
		}

	}

}
