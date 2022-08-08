package com.bilgeadam_8thAugust2022.Question4;

import java.util.List;
import java.util.UUID;

public class Book {
	String id;
	String title;
	String author;
	public List<Customer> customersRented;

	public Book(String title, String author) {
		this.id = UUID.randomUUID().toString();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public List<Customer> getCustomersRented() {
		return customersRented;
	}

	public void setCustomersRented(List<Customer> customersRented) {
		this.customersRented = customersRented;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", customersRented=" + customersRented
				+ "]";
	}

}
