package com.bilgeadam_06thJuly2022.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamadanBreadQueue {
	public static void main(String[] args) throws InterruptedException {
		Queue<String> breadQueue = new LinkedList<String>();
		breadQueue.offer("Saad");
		breadQueue.offer("Halit");
		breadQueue.offer("Emre");
		breadQueue.offer("Kaan");
		breadQueue.offer("Taha");
		breadQueue.offer("Mustafa");
		breadQueue.offer("Sinem");
		breadQueue.offer("Eda");
		breadQueue.offer("Aybuke");
		breadQueue.offer("Salman");
		breadQueue.offer("Batuhan");
		breadQueue.offer("Busra");
		Random random = new Random();
		int num_of_bread = random.nextInt(1, 11);
		System.out.println("Number of bread available: " + num_of_bread);
		System.out.println("------------------------------");
		Thread.sleep(2000);
		for (int i = 0; i < num_of_bread; i++) {
			System.out.println(breadQueue.poll() + " took his bread");
			Thread.sleep(1000);
		}
		System.out.println("------------------------------");
		System.out.println("The bread is finished.");
		System.out.println("------------------------------");
		System.out.println("People who were not able to buy bread: ");
		breadQueue.forEach(System.out::println);

	}

}
