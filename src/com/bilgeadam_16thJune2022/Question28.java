package com.bilgeadam_16thJune2022;

public class Question28 {
	/*
	 * int [] sayilar={1,4,5,6,1,1,4,8};
	 * 
	 * dizi içerisinde 1 ve 4 kaç kere geçtiğini ve 1 sayısı 4 sayısından büyükse
	 * true değilse false
	 */

	public static void main(String[] args) {
		int[] numbers = { 1, 4, 5, 6, 1, 1, 4, 8 };
		int count1 = 0;
		int count2 = 0;
		Boolean control = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1)
				count1++;
			else if (numbers[i] == 4)
				count2++;
		}
		if (count1 > count2)
			control = true;
		System.out.println("1 occurs " + count1 + " times.");
		System.out.println("4 occurs " + count2 + " times.");
		System.out.println(control);

	}

}
