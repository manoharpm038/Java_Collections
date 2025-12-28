package com.collections.TreeSet;
// Find the nearest higher and lower element for a given key.
import java.util.*;
public class FindNeighbors {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        int key = 30;

        System.out.println("Lower than " + key + ": " + ts.lower(key));
        System.out.println("Higher than " + key + ": " + ts.higher(key));

	}
}
