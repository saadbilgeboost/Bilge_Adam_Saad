package com.bilgeadam_26thJuly2022.schoolManagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class StudentManager {
	static Scanner scanner = new Scanner(System.in);

	public String nameControl() {
		System.out.print("Please enter the name of the student: ");
		String name = scanner.nextLine();
		if (name.length() < 3) {
			try {
				throw new NameException("Name should be atleast 3 characters");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			return nameControl();

		} else {
			return name;
		}

	}

	public LocalDate dateofBirthControl() {
		LocalDate date_of_birth = Utils.stringToLocalDateControl("Please enter Date of Birth of the Student: ");
		return date_of_birth;
	}

	public int ageCalculator() {
		int age = (int) dateofBirthControl().until(LocalDate.now(), ChronoUnit.YEARS);
		return age;
	}

	public double grade() {
		double grade = Utils.readDouble("Please enter the grade of the student: ");
		grade = gradeControl(grade);
		return grade;
	}

	public double gradeControl(double grade) {

		if (grade < 0 || grade > 100) {

			try {
				throw new GradeException("Grade of the student should be between 0 and 100.");

			} catch (Exception e) {
				System.err.println(e.getMessage());

			}
			return grade();

		} else {
			return grade;
		}
	}

	public double[] arrayGrade() {
		double[] grades = new double[3];
		for (int i = 0; i < 3; i++) {
			grades[i] = grade();
		}
		return grades;
	}

	public Student createStudent() {
		String name = nameControl();
		LocalDate date = dateofBirthControl();
		int age = ageCalculator();
		if (age < 8) {
			try {
				throw new AgeException("Age of the student should be atleast 8.");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			return createStudent();
		} else {
			Student student = new Student(name, date);
			student.grades = arrayGrade();
			return student;
		}

	}
}
