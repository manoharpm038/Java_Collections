package com.set.abstractset.hashset;
/*
 NavigableSet → SortedSet → Set → TreeSet

📖 Description:

Stores unique elements in sorted order (ascending by default).

Uses Red-Black Tree internally.

No null allowed (throws NullPointerException if inserted).
 */
import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(64);
		set.add(43);
		set.add(96);
		set.add(12);
		set.add(10);
		
		System.out.println(set);
		set.remove(96);
		System.out.println(set.contains(96));  // false
		System.out.println(set);
		System.out.println(set.contains(96));  // false 
		System.out.println(set.contains(10)); // true
		
		System.out.println(set.first()); // 10
		System.out.println(set.last()); // 64
		
		System.out.println(set.higher(43)); // 64
	}
}
