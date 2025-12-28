package com.collections.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// Creating a PriorityQueue of Integers (Natural order)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(25);
        pq.add(10);
        pq.add(50);
        pq.add(5);
        pq.add(30);

        System.out.println("PriorityQueue elements (Heap order): " + pq);

        // Peek: retrieves smallest element (head)
        System.out.println("Peek (Head element): " + pq.peek());

        // Poll: removes and returns the head
        System.out.println("Poll (Removed element): " + pq.poll());
        System.out.println("After poll: " + pq);

        // Remove specific element
        pq.remove(30);
        System.out.println("After removing 30: " + pq);

        // Check if element exists
        System.out.println("Contains 50? " + pq.contains(50));

        // Size of the queue
        System.out.println("Size: " + pq.size());

        // Iterating through queue (order not guaranteed)
        System.out.print("Iterating elements: ");
        for (int num : pq) {
            System.out.print(num + " ");
        }

        // Clear all elements
        pq.clear();
        System.out.println("\nAfter clear, is empty? " + pq.isEmpty());

	}

}
