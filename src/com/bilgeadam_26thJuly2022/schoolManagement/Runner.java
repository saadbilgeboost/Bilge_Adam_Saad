package com.bilgeadam_26thJuly2022.schoolManagement;

public class Runner {

	public static void main(String[] args) {
//		StudentManager studentManager = new StudentManager();

//		Student student1, student2, student3;
//		School.printList();
//		student1 = School.createStudent();
//		student2 = School.createStudent();
//		student3 = School.createStudent();
//		School.addtoList(student1, student2, student3);
//		FileUtils.writeFile(FileUtils.file);
//		FileUtils.readFile(FileUtils.file);
//		School.printList();
		School.createStudentListFromFile(FileUtils.readFile(FileUtils.file));
		School.studentList.forEach(System.out::println);
	}
}
