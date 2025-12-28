package com.collections.TreeSet;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create TreeSet
        TreeSet<Integer> ts = new TreeSet<>();

        // Add elements
        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(50);

        System.out.println("TreeSet elements (sorted): " + ts);

        // Size
        System.out.println("Size: " + ts.size());

        // Contains
        System.out.println("Contains 30? " + ts.contains(30));

        // First and Last
        System.out.println("First Element: " + ts.first());
        System.out.println("Last Element: " + ts.last());

        // Higher and Lower
        System.out.println("Higher than 30: " + ts.higher(30));
        System.out.println("Lower than 30: " + ts.lower(30));

        // Ceiling and Floor
        System.out.println("Ceiling of 25: " + ts.ceiling(25));
        System.out.println("Floor of 25: " + ts.floor(25));

        // Remove element
        ts.remove(20);
        System.out.println("After removing 20: " + ts);

        // PollFirst and PollLast
        System.out.println("PollFirst (removed): " + ts.pollFirst());
        System.out.println("PollLast (removed): " + ts.pollLast());
        System.out.println("After polling: " + ts);

        // Iteration
        System.out.print("Ascending order: ");
        for (Integer val : ts) {
            System.out.print(val + " ");
        }

        System.out.print("\nDescending order: ");
        Iterator<Integer> itr = ts.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // Clear all
        ts.clear();
        System.out.println("\nAfter clear(): " + ts);
    }
}
