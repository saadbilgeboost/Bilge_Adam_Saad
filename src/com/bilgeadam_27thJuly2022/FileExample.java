package com.bilgeadam_27thJuly2022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("Files/deneme.txt");
			FileInputStream fis = new FileInputStream("Files/deneme.txt");

			fos.write(65);
			byte[] array = { 101, 80, 88 };
			fos.write(array);
			String string = "Hello World";
			fos.write(string.getBytes());
			///// Reading operation

//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
			int value;
			while ((value = fis.read()) != -1) {
				System.out.println((char) value);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//////////////////////////////////////
		// Buffered////

		try {

			String path = "Files/exp4.txt";
			File file = new File(path);
			file.createNewFile();

			BufferedWriter writer = new BufferedWriter(new FileWriter("Files/exp2.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("Files/exp2.txt"));
			writer.write("row1 " + "\n");

			writer.write("row2");

			writer.flush();

			String value2;
//			deger2 = reader.readLine();
//			System.out.println(deger2);
//			deger2 = reader.readLine();
//			System.out.println(deger2);
//
			while ((value2 = reader.readLine()) != null) {
				System.out.println(value2);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
