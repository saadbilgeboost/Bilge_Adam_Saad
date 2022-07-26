package com.bilgeadam_26thJuly2022.schoolManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class TestSerializingOperation {

	public static void main(String[] args) {
		Student student = new Student("Ali", LocalDate.of(2000, 10, 10));
		ObjectOutputStream write = null;
		try {
			FileOutputStream file = new FileOutputStream("Files/test.txt");
			write = new ObjectOutputStream(file);
			write.writeObject(student);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				write.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		ObjectInputStream read = null;

		try {
			FileInputStream file2 = new FileInputStream("Files/test.txt");
			read = new ObjectInputStream(file2);
			Student student2 = (Student) read.readObject();
			System.out.println(student2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				read.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
