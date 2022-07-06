package com.bilgeadam_06thJuly2022.Queue;

public class Customer implements Comparable<Customer> {
	String name;
	int age;

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

	@Override
	// Arranges the queue in decreasing order of the ages. Important: -1 means
	// prior.
//	public int compareTo(Customer customer) {
//		if (this.age > customer.age) {
//			return -1;
//		} else if (this.age < customer.age) {
//			return 1;
//		} else {
//			return 0;
//		}
//
//	}
	// Arranges the queue in increasing order of the ages.
//	public int compareTo(Customer customer) {
//		if (this.age > customer.age) {
//			return 1;
//		} else if (this.age < customer.age) {
//			return -1;
//		} else {
//			return 0;
//		}
//
//	}
	// when using customer.age the priority becomes 1 rather then -1.
	public int compareTo(Customer customer) {
		if (customer.age < 65) {
			return -1;
		} else if (customer.age > 65) {
			return 1;
		} else {
			return 0;
		}

	}
}
