package com.bilgeadam_22ndJune2022;

public class Question51 {

	public static void main(String[] args) {
		int[] nums = { 10, 7, 4, 5, 6, 8, 20, 5 };
		Question51 question51 = new Question51();
		System.out.println(question51.consecutive_integers(nums));

	}

	public boolean consecutive_integers(int[] num) {
		boolean control = false;

		for (int i = 0; i < num.length - 2; i++) {
			if (num[i] + 1 == num[i + 1] && num[i] + 2 == num[i + 2]) {
				control = true;
				break;
			}
		}
		return control;
	}

}
