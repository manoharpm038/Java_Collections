package com.collections.linkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		/*
		 LinkedList is a class in the Java Collections Framework (JCF).

	-> It implements both the List and Deque (Double Ended Queue) interfaces.
	-> It stores elements in a sequence (like ArrayList), but unlike an array, it doesn’t use a contiguous memory block.
	-> It uses a doubly linked list structure internally.

	📘 Declaration:
	LinkedList<String> list = new LinkedList<>();
	LinkedList<Integer> list = new LinkedList<>();
	LinkedList<Double> list = new LinkedList<>();
	
	
	3. Key Features of LinkedList

	✅ Dynamic Size — grows and shrinks easily (no resizing needed)
	✅ Fast insertion/deletion at beginning or middle
	❌ Slow random access (no index-based direct access like arrays)
	✅ Implements both List and Deque, so you can use it as:
	
	List (add/remove at any position)
	Queue (FIFO)
	Stack (LIFO)
	
	LinkedList<Integer> list1 = new LinkedList<>(); // empty list
	LinkedList<String> list2 = new LinkedList<>(List.of("A", "B", "C")); // initialized
	
	
	// Operations
	
	➤ Add Elements
	LinkedList<String> list = new LinkedList<>();
	list.add("A");
	list.add("B");
	list.add("C");
	System.out.println(list); // [A, B, C]

	➤ Add at Specific Position
	list.add(1, "X"); // [A, X, B, C]

	➤ Add First / Add Last
	list.addFirst("Start");
	list.addLast("End");
	// [Start, A, X, B, C, End]

	 ➤ Access Elements
	 System.out.println(list.get(2)); // X
	 System.out.println(list.getFirst()); // Start
	 System.out.println(list.getLast()); //  End

	  ➤ Remove Elements
	  list.remove("X");       // removes first occurrence of "X"
	  list.remove(2);         // removes element at index 2
	  list.removeFirst();     // removes first element
	  list.removeLast();      // removes last element
	  
	  ➤ Update (Set Value)
	  list.set(1, "Updated");

	  ➤ Check
	  System.out.println(list.contains("A"));  // true
	  System.out.println(list.isEmpty());      // false
	  System.out.println(list.size());         // number of elements

	  ➤ Iteration
	  for (String s : list) {
      	 System.out.println(s);
	  }

	🔹 First, Remember:
	A Deque (Double Ended Queue) allows insertion and deletion from both ends.
	Since LinkedList implements Deque, we can easily make it behave like a:
	
	Queue (FIFO) — First In, First Out	
	Stack (LIFO) — Last In, First Out
	
	Note:
	* Linked List stores the elements as node
	* 1. Data 
	* 2. Pointer to next node
	* 3. Pointer to privious node

		 */

	}
}
