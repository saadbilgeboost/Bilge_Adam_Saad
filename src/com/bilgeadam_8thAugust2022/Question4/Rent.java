package com.bilgeadam_8thAugust2022.Question4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Rent implements ILibrary {

	public List<Book> library;
	public List<Customer> customers = new LinkedList<Customer>();
	public List<Book> rentedBooks = new ArrayList<Book>();

	@Override
	public boolean findBook(String id) {
		for (Book book : library) {
			if (book.getId().equalsIgnoreCase(id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean findCustomer(String id) {
		for (Customer customer : customers) {
			if (customer.getId().equalsIgnoreCase(id)) {
				return true;
			}
		}
		return false;

	}

	@Override
	public boolean availability(String id) {
		for (Book book : rentedBooks) {
			if (book.getTitle().equalsIgnoreCase(id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean rentBook(Book book, Customer customer) {

		if (findBook(book.id)) {
			if (availability(book.id)) {
				book.customersRented.add(customer);
				customer.booksRented.add(book);
				rentedBooks.add(book);
				return true;
			}
		}
		return false;
	}

}
