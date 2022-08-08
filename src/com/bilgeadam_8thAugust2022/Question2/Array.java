package com.bilgeadam_8thAugust2022.Question2;

public class Array {
	public int[] num_array = new int[0];
	private int size = 0;

	public int[] add(int num) {
		size++;
		int[] temp = new int[size];
		for (int i = 0; i < size - 1; i++) {
			temp[i] = num_array[i];
		}
		temp[size - 1] = num;
		num_array = temp;
		return num_array;
	}

	public int[] remove(int num) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (num_array[i] == num) {
				index = i;
				size--;
				break;
			}
		}

		int[] temp = new int[size];
		for (int i = 0, j = 0; i < num_array.length; i++, j++) {
			if (index == i)
				i++;
			temp[j] = num_array[i];

		}
		num_array = temp;
		return num_array;

	}

	public int[] add(int num, int index) {
		size++;
		int[] temp = new int[size];
		for (int i = 0, j = 0; i < size; i++, j++) {
			if (index == i)
				i++;
			temp[i] = num_array[j];

		}
		temp[index] = num;
		num_array = temp;
		return num_array;

	}

	public int[] array() {
		return num_array;
	}
}
