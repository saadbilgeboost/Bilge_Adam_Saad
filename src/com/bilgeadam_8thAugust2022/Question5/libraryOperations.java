package com.bilgeadam_8thAugust2022.Question5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bilgeadam_8thAugust2022.Question4.Book;
import com.bilgeadam_8thAugust2022.Question4.Customer;
import com.bilgeadam_8thAugust2022.Question4.Rent;

public class libraryOperations {
	public Customer fromId(String id) {
		Customer lastCustomer = null;
		Rent rent = new Rent();
		rent.rentedBooks.stream().map(s -> {
			if (s.getId().equalsIgnoreCase(id)) {
				return s.customersRented.get(s.customersRented.size() - 1);
			}
			return lastCustomer;
		});
		return lastCustomer;
	}

	public List<Customer> fromBookName(String name) {
		List<Customer> customersRented = null;
		Rent rent = new Rent();
		rent.rentedBooks.stream().map(s -> {
			if (s.getId().equalsIgnoreCase(name)) {
				return s.customersRented;
			}
			return customersRented;
		});
		return customersRented;
	}

	public List<Customer> startWithAhm() {
		Rent rent = new Rent();
		List<Customer> ahmCustomers = new ArrayList<Customer>();
		ahmCustomers = rent.customers.stream().filter(s -> s.getName().startsWith("ahm")).collect(Collectors.toList());
		return ahmCustomers;
	}

	public List<Book> fromCustomerId(String id) {
		List<Book> booksRented = null;
		Rent rent = new Rent();
		rent.customers.stream().map(s -> {
			if (s.getId().equalsIgnoreCase(id)) {
				return s.booksRented;
			}
			return booksRented;
		});
		return booksRented;
	}

}
