package com.bilgeadam_20thJuly2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindAlphabetFrequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string.............:  ");
		String sentence = scanner.nextLine().toLowerCase();
		Map<Character, Integer> frequencyMap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < sentence.length(); i++) {
			char character = sentence.charAt(i);
			if (frequencyMap.containsKey(character)) {
				frequencyMap.replace(character, frequencyMap.get(character) + 1);
			} else {
				frequencyMap.put(character, 1);
			}

		}
		for (Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		scanner.close();
	}
}
