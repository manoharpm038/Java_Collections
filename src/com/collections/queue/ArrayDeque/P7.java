package com.collections.queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // TODO: Read the number of initial customers (n)
        int n = sc.nextInt();
        // TODO: Create an ArrayDeque to store customer IDs
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        // TODO: Read and add n customer IDs to the ArrayDeque
        for(int i = 0; i < n; i++) {
            ad.add(sc.nextInt());
        }
        // TODO: Read the customer ID to insert at the front
        ad.addFirst(sc.nextInt());
        // TODO: Read the customer ID to insert at the end
        ad.addLast(sc.nextInt());
        // TODO: Remove the first customer from the queue
        ad.removeFirst();
        ad.removeFirst();
        // TODO: Print the updated queue of customer IDs

        System.out.println("Updated Queue of Customer IDs: ");
        for(int ul: ad) {
            System.out.print(ul + " ");
        }
        sc.close();

	}

}
