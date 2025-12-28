package com.collections.TreeSet;
import java.util.*;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Read the number of product prices (n)
        int n = sc.nextInt();

        // Create a TreeSet to store product prices
        TreeSet<Integer> ts = new TreeSet<>();

        // Read and add n product prices to the TreeSet
        for (int i = 0; i < n; i++) {
            ts.add(sc.nextInt());
        }

        // Read the minPrice and maxPrice for the range query
        int minPrice = sc.nextInt();
        int maxPrice = sc.nextInt();

        // Perform the range query using subSet()
        // subSet(fromElement, toElement) → excludes 'toElement' by default
        TreeSet<Integer> rangeSet = new TreeSet<>(ts.subSet(minPrice, true, maxPrice, true));

        // Print the product prices in the range, or "NO PRODUCTS" if none are found
        if (rangeSet.isEmpty()) {
            System.out.println("NO PRODUCTS");
        } else {
            for (int price : rangeSet) {
                System.out.print(price + " ");
            }
        }

        sc.close();

	}

}
