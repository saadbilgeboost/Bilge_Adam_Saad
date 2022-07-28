package com.bilgeadam_19thJuly2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		String[] student = { "Ayse", "Ece", "Mahmut" };
		int[] grades = { 60, 80, 70 };
		int[][] grades2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };

		Map<String, Integer> studentgrades = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < student.length; i++) {
			studentgrades.put(student[i], grades[i]);
		}

		for (Entry<String, Integer> entry : studentgrades.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		System.out.println("--------------------------------------------------------");

		Map<String, int[]> studentgrades2 = new HashMap<String, int[]>();

		for (int i = 0; i < student.length; i++) {
			studentgrades2.put(student[i], grades2[i]);
		}
		for (Entry<String, int[]> entry : studentgrades2.entrySet()) {
			System.out.print(entry.getKey() + " - ");
			for (int i = 0; i < entry.getValue().length; i++) {
				System.out.print(entry.getValue()[i] + ", ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------");
		Map<String, List<Integer>> studentgrades3 = new LinkedHashMap<String, List<Integer>>();
		for (int i = 0; i < grades2.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < grades2[i].length; j++) {
				list.add(grades2[i][j]);
			}
			studentgrades3.put(student[i], list);
		}
		studentgrades3.entrySet().forEach(s -> System.out.println(s.getValue() + "-" + s.getKey()));
	}
}
