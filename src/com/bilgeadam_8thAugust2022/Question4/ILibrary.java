package com.bilgeadam_8thAugust2022.Question4;

public interface ILibrary {
	public boolean findBook(String id);

	public boolean findCustomer(String id);

	public boolean availability(String id);

	public boolean rentBook(Book book, Customer customer);
}
