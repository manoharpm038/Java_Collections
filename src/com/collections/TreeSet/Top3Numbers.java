package com.collections.TreeSet;
import java.util.*;
import java.util.Arrays;

public class Top3Numbers {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(10, 90, 30, 50, 70, 80));
		
		Iterator<Integer> itr = ts.descendingIterator();
		
		int count = 0;
		
		while(itr.hasNext() && count < 3) {
			System.out.print(itr.next() + " ");
			count++;
		}
	}

}
