package com.collections.priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Read the number of initial tasks
        int n = sc.nextInt();

        // Create a PriorityQueue to store task priorities (Min-Heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Read and add n task priorities to the PriorityQueue
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        // Read the new task priority to insert
        pq.add(sc.nextInt());

        // Remove the highest-priority task (smallest number = highest priority)
        pq.poll();

        // Print the updated queue of task priorities
        System.out.println("Updated Queue of Task Priorities: ");
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(pq);  // Copy to preserve pq

        while (!pq1.isEmpty()) {
            System.out.print(pq1.poll() + " ");  // method call needs ()
        }

        sc.close();

	}
}
