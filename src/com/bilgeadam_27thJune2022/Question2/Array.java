package com.bilgeadam_27thJune2022.Question2;

public class Array {
	static int[] num_array = new int[0];

	public int[] add(int num) {
		int[] temp = new int[num_array.length + 1];
		for (int i = 0; i < num_array.length; i++) {
			temp[i] = num_array[i];
		}
		temp[num_array.length] = num;
		num_array = temp;
		return num_array;
	}

	public int[] erase(int num) {
		int index = -1;
		for (int i = 0; i < num_array.length; i++) {
			if (num_array[i] == num) {
				index = i;
				break;
			}
		}

		int[] temp = new int[num_array.length - 1];
		for (int i = 0, j = 0; i < num_array.length; i++, j++) {
			if (index == i)
				i++;
			temp[j] = num_array[i];

		}
		num_array = temp;
		return num_array;
	}

	public int[] add_inbetween(int num, int index) {
		int[] temp = new int[num_array.length + 1];
		for (int i = 0, j = 0; i < temp.length; i++, j++) {
			if (index == i)
				i++;
			temp[i] = num_array[j];

		}
		temp[index] = num;
		num_array = temp;
		return num_array;
	}

	public void print_array() {
		for (int i = 0; i < num_array.length; i++) {
			System.out.print(num_array[i] + ", ");
		}
		System.out.println();
	}
}
