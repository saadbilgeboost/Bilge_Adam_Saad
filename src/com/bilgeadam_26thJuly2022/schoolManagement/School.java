package com.bilgeadam_26thJuly2022.schoolManagement;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class School {
	static List<Student> studentList = new ArrayList<Student>();

	public static Student createStudent() {
		StudentManager studentManager = new StudentManager();
		String name = studentManager.nameControl();
		LocalDate date = studentManager.dateofBirthControl();
		int age = studentManager.ageCalculator(date);
		if (!studentManager.ageControl(age)) {
			System.out.println();
			return createStudent();
		} else {
			Student student = new Student(name, date);
			student.grades = studentManager.arrayGrade();
			return student;
		}

	}

	public static void createStudentListFromFile(String text) {

		String[] text2 = text.split("\n");
		String[] text3 = new String[5];

		for (int i = 0; i < text2.length; i++) {
			text2[i] = text2[i].substring(0, text2[i].length() - 1);
			text3 = text2[i].split(", ");
			Student student = new Student();
			student.name = text3[0];
			student.birthDate = LocalDate.parse(text3[1]);
			double grade1 = Double.parseDouble(text3[2]);
			double grade2 = Double.parseDouble(text3[3]);
			double grade3 = Double.parseDouble(text3[4]);
			double[] grades = { grade1, grade2, grade3 };
			student.grades = grades;
			studentList.add(student);
		}
		studentList.forEach(System.out::println);
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

	public static void addtoList(Student... student) {
		for (Student temp : student) {
			studentList.add(temp);
		}
	}

	public static void createStudentListFromFile(File file) {
		String text = FileUtils.readFile(file);
		text.split("\n");
	}

}
