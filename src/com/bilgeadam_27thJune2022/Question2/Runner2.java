package com.bilgeadam_27thJune2022.Question2;

public class Runner2 {

	public static void main(String[] args) {

		Array array = new Array();
		int[] num_array = Array.num_array;
		num_array = array.add(5);

		System.out.println(num_array[0]);
		num_array = array.add(3);
		array.print_array();
		num_array = array.erase(5);
		array.print_array();
		num_array = array.add(34);
		num_array = array.add(48);
		array.print_array();
		num_array = array.add_inbetween(32, 2);
		array.print_array();
		System.out.println();
		num_array = array.erase(32);
		array.print_array();
		System.out.println();
		array.print_array();
	}

}
