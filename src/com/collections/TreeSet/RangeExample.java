package com.collections.TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

// Given numbers [5, 10, 15, 20, 25, 30, 35], print elements between 10 and 30
public class RangeExample {

	public static void main(String[] args) {
		 
		        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(5, 10, 15, 20, 25, 30, 35));

		        System.out.println("Elements between 10 and 30: " + ts.subSet(10, true, 30, true));
		    }

	}

