package com.bilgeadam_26thJuly2022.schoolManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	public static String path = "Files/Student.txt";
	public static File file = new File(path);

	public static String readFile(File file) {

		BufferedReader bfr = null;
		String completeText = "";
		try {
			bfr = new BufferedReader(new FileReader(file));
			String text;
			while ((text = bfr.readLine()) != null) {
				completeText += text + "\n";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return completeText;

	}

	public static void writeFile(File file) {
		for (int i = 0; i < School.studentList.size(); i++) {
			String name = School.studentList.get(i).getName();
			String date = School.studentList.get(i).getBirthDate().toString();
			double[] grade = School.studentList.get(i).getGrades();
			String grade1 = ((Double) grade[0]).toString();
			String grade2 = ((Double) grade[1]).toString();
			String grade3 = ((Double) grade[2]).toString();

			BufferedWriter bfw = null;
			String text = null;
			try {
				bfw = new BufferedWriter(new FileWriter(file, true));
				text = name + ": " + date + ", " + grade1 + ", " + grade2 + ", " + grade3 + ".";
				bfw.write(text + "\n");
				bfw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					bfw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static void createFile(File file) throws Exception {
		if (file.exists()) {
			throw new Exception("The file already exists.");
		} else {
			System.out.println("Creating file....");
			file.createNewFile();
			Thread.sleep(1000);
			System.out.println("File Created.");
		}
	}

}
