package com.collections.TreeSet;
// From a set of integers, find the smallest and largest elements using TreeSet methods
import java.util.Arrays;
import java.util.TreeSet;

public class MinMaxTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(35, 10, 60, 25, 5));
        System.out.println("Smallest element: " + ts.first());
        System.out.println("Largest element: " + ts.last());

	}

}
