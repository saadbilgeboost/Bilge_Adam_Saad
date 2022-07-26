package com.bilgeadam_26thJuly2022.schoolManagement;

import java.util.ArrayList;
import java.util.List;

public class School {
	static List<Student> studentList = new ArrayList<Student>();

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student1, student2, student3;
		printList();
		student1 = studentManager.createStudent();
		studentList.add(student1);

//		student2 = studentManager.createStudent();
//		studentList.add(student2);
//		student2.setGrades(studentManager.arrayGrade());
//
//		student3 = studentManager.createStudent();
//		studentList.add(student3);
//		student3.setGrades(studentManager.arrayGrade());

		printList();
	}

	public static void printList() {
		if (studentList.isEmpty()) {
			try {
				throw new StudentException("The list is empty");
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		} else {
			studentList.forEach(System.out::println);
		}

	}
}
