package com.bilgeadam_8thAugust2022.Question4;

import java.time.LocalDate;
import java.util.List;

public class Customer extends Person {

	LocalDate issueDate;
	LocalDate dueDate;
	public List<Book> booksRented;

	public Customer(String name, String surname) {
		super(name, surname);
		this.issueDate = LocalDate.now();
		this.dueDate = issueDate.plusDays(30);

	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public List<Book> getBooksRented() {
		return booksRented;
	}

	@Override
	public String toString() {
		return "Customer [issueDate=" + issueDate + ", dueDate=" + dueDate + ", booksRented=" + booksRented + ", id="
				+ id + ", name=" + name + ", surname=" + surname + "]";
	}

}
