package com.bilgeadam_26thJuly2022.schoolManagement;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public class Student implements Serializable {
	String name;
	double[] grades;
	LocalDate birthDate;

	public Student(String name, LocalDate birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grades=" + Arrays.toString(grades) + ", birthDate=" + birthDate + "]";
	}

}
