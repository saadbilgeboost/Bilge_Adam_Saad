package com.bilgeadam_06thJuly2022.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(100);
		queue.add(65);
		queue.offer(45);
		queue.add(75);
		queue.add(63);
		queue.add(28);

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println(queue.isEmpty());
		/*
		 * using remove method twice and there is only one element then remove will give
		 * error while poll will return null.
		 */
	}

}
