package com.collections.priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // TODO: Read the number of initial tasks (n)
        int n = sc.nextInt();
        // TODO: Create a PriorityQueue to store task priorities
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // TODO: Read and add n task priorities to the PriorityQueue
        for(int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        // TODO: Read the new task priority to insert
        int newTask = sc.nextInt();
    
        // TODO: Add the new task priority to the PriorityQueue
        pq.add(newTask);
        // TODO: Count the number of elements in the PriorityQueue
        int count = 0;
        for(int num: pq) {
            count++;
        }
        // TODO: Print the count of elements
        System.out.println("Number of elements in the Priority Queue: " + count);
        sc.close();

	}
}
