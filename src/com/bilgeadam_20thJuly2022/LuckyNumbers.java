package com.bilgeadam_20thJuly2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LuckyNumbers {
	public static final int maxNum = 100;
	public static final int numCount = 10_000;

	Map<Integer, Integer> numbersMap;
	List<Integer> numberList;
	Set<Integer> numberSet;

	public static void main(String[] args) {
		LuckyNumbers luckyNumbers = new LuckyNumbers();
		luckyNumbers.mapBuilder();
		System.out.println("*********************");
		luckyNumbers.listBuilder();
		System.out.println("*********************");
		luckyNumbers.setBuilder();
		System.out.println("*********************");
		System.out.println("Numbers greater than 50.");
		luckyNumbers.numberSet.stream().filter(x -> x > 50).forEach(System.out::println);
		System.out.println("Sum of numbers in the set.");
		System.out.println(luckyNumbers.numberSet.stream().reduce((s1, s2) -> (s1 + s2)).get());
		System.out.println("Sum of numbers greater than 50.");
		System.out.println(luckyNumbers.numberSet.stream().filter(x -> x > 50).reduce((s1, s2) -> (s1 + s2)).get());
	}

	public LuckyNumbers() {
		super();
		this.numbersMap = new HashMap<Integer, Integer>();
		this.numberList = new ArrayList<Integer>();
		this.numberSet = new TreeSet<Integer>();// Tree set gives the list in increasing order.
	}

	public void setBuilder() {
		Collections.shuffle(numberList);
		while (numberSet.size() < 10) {
			int num = numberList.get(randomNumbers(numCount));
			numberSet.add(num);
		}
		numberSet.forEach(n -> System.out.println(n));
	}

	public void listBuilder() {

		for (Entry<Integer, Integer> numbers : numbersMap.entrySet()) {
			for (int i = 0; i < numbers.getValue(); i++) {
				numberList.add(numbers.getKey());
			}
		}
		System.out.println(numberList.size());
	}

	public void mapBuilder() {
		for (int i = 0; i < numCount; i++) {
			int num = randomNumbers(maxNum);
			if (numbersMap.containsKey(num)) {
				numbersMap.replace(num, numbersMap.get(num) + 1);

			} else {
				numbersMap.put(num, 1);
			}
		}
		for (Entry<Integer, Integer> entry : numbersMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}

	public static int randomNumbers(int num) {
		Random random = new Random();
		int number = random.nextInt(1, num + 1);
		return number;
	}

}
