package com.bilgeadam_27thJuly2022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	/*
	 * 
	 * System.out.println("0- Çıkış"); System.out.println("1- Dosya Yarat");
	 * System.out.println("2- Ekle"); System.out.println("3- Okuma");
	 * System.out.println("4- Harf Değiştir"); System.out.println("5- Dosya silme");
	 * System.out.println("lütfen işlem seçiniz");
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		FileOperations fileOperations = new FileOperations();
		fileOperations.menu();

	}

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {
			System.out.println("0- Exit");
			System.out.println("1- Create File");
			System.out.println("2- Add");
			System.out.println("3- Read");
			System.out.println("4- Change alphabet");
			System.out.println("5- Delete File");
			System.out.println("Please select an operation");
			input = Integer.parseInt(scanner.nextLine());

			switch (input) {
			case 1:
				try {
					createFile(FileConstants.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				addText(FileConstants.file);
				break;
			case 3:
				readFile(FileConstants.file);
				break;
			case 4:
				changeAlphabet(readFile(FileConstants.file));
			case 5:
				try {
					deleteFile(FileConstants.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			default:
				break;
			}
		} while (input != 0);

	}

	private void deleteFile(File file) throws Exception {
		if (file.exists()) {
			System.out.println("Deleting file...");
			file.delete();
			Thread.sleep(1000);
			System.out.println("File Deleted.");
		} else {
			throw new Exception("The file does not exist.");
		}

	}

	private void changeAlphabet(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the alphabet you want to replace.");
		char oldAlphabet = scanner.nextLine().charAt(0);
		System.out.println("Please enter the alphabet you want to replace with.");
		char newAlphabet = scanner.nextLine().charAt(0);
		text = text.replace(oldAlphabet, newAlphabet);
		System.out.println(text);
	}

	private String readFile(File file) {

		BufferedReader bfr = null;
		String completeText = "";
		try {
			bfr = new BufferedReader(new FileReader(file));
			String text;
			while ((text = bfr.readLine()) != null) {
				System.out.println(text);
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

	private void addText(File file) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to add the text to the file? (Y/N)");
		String decision = scanner.nextLine();
		boolean control = false;
		if (decision.equalsIgnoreCase("Y")) {
			control = true;
		}
		System.out.println("Please enter the information you want to write.");
		String text = scanner.nextLine();
		BufferedWriter bfw = null;
		try {
			bfw = new BufferedWriter(new FileWriter(file, control));
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

	private void createFile(File file) throws Exception {
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
