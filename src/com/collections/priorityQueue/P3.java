package com.collections.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Read the number of initial tasks
        int n = sc.nextInt();

        // ✅ Create a PriorityQueue as a MAX-PRIORITY QUEUE using Comparator.reverseOrder()
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Read and add n task priorities
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        // Read the new task priority to insert
        int newTask = sc.nextInt();

        // Add the new task priority
        pq.add(newTask);

        // Remove the highest-priority task (largest number)
        pq.poll();

        // Print the updated queue
        System.out.println("Updated Priority Queue of Task Priorities: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        sc.close();
	}
}
