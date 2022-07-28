package com.bilgeadam_21stJuly2022.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	int id;
	String status;
	String department;
	String name;
	List<Double> grades = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double avgCalculator() {

		return grades.stream().collect(Collectors.averagingDouble(Double::doubleValue));

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getGrades() {
		return grades;
	}

	public void setGrades(List<Double> grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", status=" + status + ", department=" + department + ", name=" + name
				+ ", grades=" + grades + "]";
	}

}