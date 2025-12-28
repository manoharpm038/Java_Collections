package com.collections.TreeSet;

import java.util.TreeSet;

// Given an array of integers, remove all duplicates and print elements in sorted order.
/*
Input: [50, 20, 10, 20, 40, 50]
Output: [10, 20, 40, 50]
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {50, 20, 10, 20, 40, 50};
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int num: arr) {
			set.add(num);
		}
		
		System.out.print(set + " ");
	}
}
