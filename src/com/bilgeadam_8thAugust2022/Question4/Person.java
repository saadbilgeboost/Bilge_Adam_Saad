package com.bilgeadam_8thAugust2022.Question4;

import java.util.UUID;

public class Person {
	String id;
	String name;
	String surname;

	public Person(String name, String surname) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId() {
		return id;
	}

}
