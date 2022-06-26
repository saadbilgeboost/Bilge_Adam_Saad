package com.bilgeadam_24thJune2022;

import java.util.Scanner;

public class Application {
	User user;
	int number_of_visitors;
	static Scanner scanner = new Scanner(System.in);

	public void menu() {
		int input = 0;
		do {
			System.out.println("=====Application Login Screen=====");
			System.out.println("Number of Visitors: " + number_of_visitors);
			System.out.println("Number of Users: " + user.id);
			System.out.println("-------------------------------------");
			System.out.println("1-) Register");
			System.out.println("2-) Login");
			System.out.println("3-) Sign out");
			System.out.println("Please select one of the above: ");
			input = scanner.nextInt();
			scanner.nextLine();
			switch (input) {
			case 1:
				register();
				break;
			case 2:
				login();

			default:
				break;
			}

		} while (input != 0);

	}

	private void login() {
		System.out.print("Please enter your email address: ");
		String email = scanner.nextLine();
		System.out.print("Please enter your password: ");
		String password = scanner.nextLine();

		int chance = 0;
		do {
			if (user.email.equalsIgnoreCase(email) && user.password.equals(password)) {
				System.out.println(" You have successfully logged in.");
				user.id++;
				homePage();
			} else {
				System.out.println("User name or password enetered is wrong.");
				chance++;
				resetPassword(chance);
			}

		} while (chance != 3);

	}

	private void change_Password() {
		System.out.print("Please enter new password: ");
	}

	public void resetPassword(int chance) {
		if (chance == 3) {
			change_Password();
		} else {
			System.out.println("Do you want to reset your password? (Y/N)");
			String choice = scanner.nextLine();
			if (choice.equalsIgnoreCase("Y")) {
				change_Password();
			}
		}

	}

	public void homePage() {
		int input = 0;
		do {
			System.out.println("1-) Create Surevey.");
			System.out.println("2-) Delete Survey.");
			System.out.println("3-) Exit.");
			input = scanner.nextInt();
			switch (input) {
			case 1:

				break;

			default:
				break;
			}

		} while (input != 0);

	}

	public void register() {
		user = new User();
		System.out.print("Please enter your name: ");
		user.name = scanner.nextLine().trim();
		String email = email_control();
		String password = password_control();

		user.email = email;
		user.password = password;

		user.id += 1;

		System.out.println("You have successfully registered.");

	}

	public String email_control() {
		boolean control = true;
		String email;
		do {
			System.out.print("Please enter your email: ");
			email = scanner.nextLine().trim();
			if (email.contains("@") && email.endsWith(".com")) {
				System.out.println("Your email has been registered.");
				control = false;
			}

		} while (control);
		return email;
	}

	private String password_control() {
		boolean control = true;
		String password;
		do {
			System.out.print("Please enter your password: ");
			password = scanner.nextLine().trim();
			if (password.length() > 4) {
				System.out.println("Your password has been registered.");
				control = false;
			}

		} while (control);
		return password;

	}
}
