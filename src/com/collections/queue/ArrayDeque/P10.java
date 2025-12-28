package com.collections.queue.ArrayDeque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// create queue using linked list
		//int n = sc.nextInt();
		Queue<String> requestQueue = new LinkedList<>();
		
		// Enqueue requests into the server queue
		requestQueue.add("R 1");
		requestQueue.add("R 2");
		requestQueue.add("R 3");
		System.out.println(requestQueue);
		
		requestQueue.offer("R 4");
		requestQueue.offer("R 5");
		requestQueue.offer("R 6");
		System.out.println(requestQueue);
		
		requestQueue.remove("R 4");
		System.out.println(requestQueue);
		
		System.out.println(requestQueue.poll()); // remove first

	}
}
