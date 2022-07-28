package com.bilgeadam_23rdJune2022;

public class Car {
	String brand;
	String color;
	String model;
	int productionYear;
	Motor motor;

	public void printValues() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(model);
		System.out.println(productionYear);
		System.out.println(motor.motorPower);
	}

}
