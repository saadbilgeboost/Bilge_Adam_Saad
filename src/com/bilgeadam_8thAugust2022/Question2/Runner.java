package com.bilgeadam_8thAugust2022.Question2;

public class Runner {

	public static void main(String[] args) {

		Array array = new Array();
		int[] num_array = array.num_array;
		num_array = array.add(5);
		System.out.println(num_array[0]);

		num_array = array.add(3);

		num_array = array.remove(5);

		num_array = array.add(34);
		num_array = array.add(48);

		num_array = array.add(32, 2);

		num_array = array.remove(75);
		num_array = array.array();

		for (int i : num_array) {
			System.out.print(i + ", ");
		}

	}

}
