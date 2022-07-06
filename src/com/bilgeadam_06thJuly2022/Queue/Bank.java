package com.bilgeadam_06thJuly2022.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Bank {

	public static void main(String[] args) {
		Queue<Customer> customerQueue = new PriorityQueue<Customer>();

		customerQueue.offer(new Customer("Mustafa", 34));
		customerQueue.offer(new Customer("Kemal", 66));
		customerQueue.offer(new Customer("Okan", 50));
		customerQueue.offer(new Customer("Gizem", 24));

		int i = 1;
		while (!customerQueue.isEmpty()) {
			System.out.println("--------------------");
			System.out.println(i + "." + customerQueue.poll());
			i++;
		}
	}

}
