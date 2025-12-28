package com.set.abstractset.hashset;
/*
Set → HashSet → LinkedHashSet

📖 Description:

Maintains insertion order (unlike HashSet).

Still stores only unique elements.

Uses linked list + hash table internally.
 */
import java.util.LinkedHashSet;

public class Demo3 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		System.out.println(set); // It preserves the order
	}
}
