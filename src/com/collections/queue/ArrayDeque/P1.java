package com.collections.queue.ArrayDeque;

import java.util.ArrayDeque;

// Use ArrayDeque to perform basic queue operations (enqueue, dequeue, peek).
public class P1 {

	public static void main(String[] args) {
	        ArrayDeque<Integer> queue = new ArrayDeque<>();

	        queue.offer(10);
	        queue.offer(20);
	        queue.offer(30);

	        System.out.println("Queue: " + queue);
	        System.out.println("Front: " + queue.peek());

	        queue.poll();
	        System.out.println("After dequeue: " + queue);
		
	}
}
