package com.collections.LinkedHashSet;

public class LinkedHashSetConcept {

	/*
	 LinkedHashSet (Java Collections)
	Definition
	
	LinkedHashSet is a HashSet + LinkedList combination.
	It stores unique elements like HashSet, but maintains insertion order using a linked list.
	
	Key Points (Easy to Remember)
	
	Maintains insertion order
	(Elements are returned in the same order you inserted them.)
	
	No duplicates allowed
	(If you insert the same element again, it will be ignored.)
	
	Uses hashing + doubly linked list
	(Hashing for fast access, linked list for order.)
	
	Search, Insert, Delete → O(1) average time.
	
	Allows null value (only one).
	
	Internal Working (Simple)
	
	When you insert an element → it is stored in a hash table.
	
	At the same time, it keeps a linked list that stores the order of insertion.
	
	Duplicate elements are not added, because it first checks in the hash table.
	
	Example (Very Clear)
	import java.util.LinkedHashSet;
	
	public class Main {
	    public static void main(String[] args) {
	        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	
	        lhs.add(10);
	        lhs.add(20);
	        lhs.add(30);
	        lhs.add(20);   // duplicate, ignored
	
	        System.out.println(lhs);
	    }
	}


Output:

[10, 20, 30]
	 */

}
