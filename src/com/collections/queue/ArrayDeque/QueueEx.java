package com.collections.queue.ArrayDeque;

import java.util.ArrayDeque;

public class QueueEx {

	public static void main(String[] args) {
		
	        ArrayDeque<Integer> queue = new ArrayDeque<>();

	        queue.offer(10);
	        queue.offer(20);
	        queue.offer(30);

	        System.out.println(queue);   // [10, 20, 30]

	        queue.poll();  // removes front element (10)
	        System.out.println(queue);   // [20, 30]

	}
}
