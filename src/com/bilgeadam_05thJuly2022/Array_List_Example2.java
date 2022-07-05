package com.bilgeadam_05thJuly2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Array_List_Example2 {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < 35; i++) {
			int x = random.nextInt(0, Integer.MAX_VALUE);
			if (x % 2 == 0) {
				even.add(x);
			} else {
				odd.add(x);
			}
		}
		System.out.print("Even Numbers: ");
		for (int x : even) {
			System.out.print(x + ", ");
		}
		System.out.println();
		System.out.print("Odd Numbers: ");
		for (int x : odd) {
			System.out.print(x + ", ");
		}
	}

}
