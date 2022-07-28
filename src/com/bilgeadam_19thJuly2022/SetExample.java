package com.bilgeadam_19thJuly2022;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string.............:  ");
		String sentence = scanner.nextLine().toLowerCase();

		Set<Character> set = new HashSet<Character>();
		Set<Character> repeating = new HashSet<Character>();
		Set<Character> nonrepeating = new LinkedHashSet<Character>();

		for (int i = 0; i < sentence.length(); i++) {

			set.add(sentence.charAt(i));

			if (!nonrepeating.add(sentence.charAt(i))) {

				repeating.add(sentence.charAt(i));
				nonrepeating.remove(sentence.charAt(i));

			}
		}
		set.forEach(m -> System.out.println(m));
		System.out.println("----------------------------------");
		System.out.println("Repeating characters");
		System.out.println("----------------------------------");
		repeating.forEach(m -> System.out.println(m));
		System.out.println("----------------------------------");
		System.out.println("Non-repeating characters");
		System.out.println("----------------------------------");
		nonrepeating.forEach(m -> System.out.println(m));

		scanner.close();
	}

}
