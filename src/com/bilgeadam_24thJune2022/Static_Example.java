package com.bilgeadam_24thJune2022;

public class Static_Example {

	int number1 = 0;
	static int number2;

	public static void main(String[] args) {
		Static_Example staticExample = new Static_Example();
		staticExample.give_number();
		Static_Example staticExample2 = new Static_Example();
		staticExample2.give_number();

	}

	public void give_number() {
		number1 += 1;
		number2 += 1;
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
	}

}
