package com.bilgeadam_21stJuly2022;

public enum EProduct {
	Chips(20), Cola(15), Sugar(60), Oil(200), Flour(50), Bread(5), Tea(60), Egg(14), Yogurt(22), Milk(12);

	double price;

	private EProduct(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
