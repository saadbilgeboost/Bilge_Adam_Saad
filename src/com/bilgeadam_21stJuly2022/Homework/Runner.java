package com.bilgeadam_21stJuly2022.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {

	static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		Runner runner = new Runner();
		Student student = new Student();
		student.name = "Ali";
		student.grades.add(50.0);
		student.grades.add(50.0);
		student.grades.add(50.0);
		student.id = 1;
		student.department = "tm";
		Student student2 = new Student();
		student2.name = "AyÅŸe";
		student2.grades.add(80.0);
		student2.grades.add(55.5);
		student2.grades.add(79.4);
		student2.id = 2;
		student2.department = "mat";
		Student student3 = new Student();
		student3.name = "Hakan";
		student3.grades.add(86.0);
		student3.grades.add(97.5);
		student3.grades.add(50.4);
		student3.id = 3;
		student3.department = "mat";
		Student student4 = new Student();
		student4.name = "Mert";
		student4.grades.add(10.0);
		student4.grades.add(35.5);
		student4.grades.add(58.4);
		student4.id = 4;
		student4.department = "tm";
		Student student5 = new Student();
		student5.name = "Gamze";
		student5.grades.add(68.0);
		student5.grades.add(23.5);
		student5.grades.add(90.4);
		student5.id = 5;
		student5.department = "mat";
		Student student6 = new Student();
		student6.name = "Merve";
		student6.grades.add(36.0);
		student6.grades.add(23.5);
		student6.grades.add(58.4);
		student6.id = 6;
		student6.department = "tm";
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);

		runner.averageCalculator();
		runner.toMapConverter();
		// runner.finalStatus();
		runner.finalStatus2();

		students.stream().forEach(s -> s.grades.add(55.0));
		students.stream().forEach(s -> {
			s.grades = s.grades.stream().map(k -> k + 15).collect(Collectors.toList());

		});
		students.stream().forEach(s -> s.setGrades(s.getGrades().stream().map(a -> a + 15.0).toList()));
		students.stream().forEach(s -> System.out.println(s));
//		List<Double> avgGrades = students.stream().map(y -> {
//			return y.grades.stream().collect(Collectors.averagingDouble(t -> t));
//		}).collect(Collectors.toList());
//		for (Double avg : avgGrades) {
//			System.out.println(avg);
//		}
		students.stream().forEach(s -> {
			s.grades = s.grades.stream().map(k -> k + 15).collect(Collectors.toList());
		});
		runner.toMapConverter2();
	}

	public void finalStatus2() {
		students.stream().filter(s -> s.avgCalculator() > 50).forEach(x -> x.setStatus("Pass"));
		students.stream().filter(s -> s.avgCalculator() <= 50).forEach(x -> x.setStatus("Fail"));
	}

	public void finalStatus() {
		for (Student student : students) {
			double average = student.grades.stream().collect(Collectors.averagingDouble(s -> s));
			if (average > 50) {
				student.setStatus("Pass");
			} else {
				student.setStatus("Fail");
			}
		}
	}

	public void averageCalculator() {
		for (Student student : students) {
			double average = student.grades.stream().collect(Collectors.averagingDouble(s -> s));
			System.out.println("Average grade of " + student.name + " is " + average + ".");
		}
	}

	public void toMapConverter() {
		Map<String, List<Student>> studentMap = new HashMap<String, List<Student>>();
		studentMap = students.stream().collect(Collectors.groupingBy(Student::getDepartment));
		studentMap.entrySet().forEach(System.out::println);
	}

	public void toMapConverter2() {
		Map<Integer, String> idNameMap = new HashMap<Integer, String>();
		idNameMap = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));
		idNameMap.entrySet().forEach(System.out::println);
	}

}
