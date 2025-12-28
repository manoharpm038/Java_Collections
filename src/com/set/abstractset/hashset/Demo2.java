package com.set.abstractset.hashset;

import java.util.HashSet;

public class Demo2 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(10);
		
		System.out.println(set.isEmpty());
		System.out.println(set);
	}
}
