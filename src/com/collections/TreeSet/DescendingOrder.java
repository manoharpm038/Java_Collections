package com.collections.TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class DescendingOrder {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(10, 40, 20, 30, 50));

        System.out.println("Descending order: " + ts.descendingSet());

	}

}
