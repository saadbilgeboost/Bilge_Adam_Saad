package com.bilgeadam_27thJune2022.Question2;

public class Runner {

	public static void main(String[] args) {
		int[] num_array = new int[0];
		Array array = new Array();
		num_array = array.add(num_array, 5);
		System.out.println(num_array[0]);
		num_array = array.add(num_array, 3);
		System.out.println(num_array[0]);
		System.out.println(num_array[1]);
		num_array = array.erase(num_array, 5);
		System.out.println(num_array[0]);
		num_array = array.add(num_array, 34);
		num_array = array.add(num_array, 48);
		for (int i = 0; i < num_array.length; i++) {
			System.out.print(num_array[i] + ", ");
		}
		System.out.println();
		num_array = array.add_inbetween(num_array, 32, 2);
		for (int i = 0; i < num_array.length; i++) {
			System.out.print(num_array[i] + ", ");
		}
		System.out.println();
		num_array = array.erase(num_array, 32);
		for (int i = 0; i < num_array.length; i++) {
			System.out.print(num_array[i] + ", ");
		}
		System.out.println();
		array.print_array(num_array);
	}

}
