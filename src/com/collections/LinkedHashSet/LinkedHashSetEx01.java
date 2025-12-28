package com.collections.LinkedHashSet;
import java.util.LinkedList;
public class LinkedHashSetEx01 {

	public static void main(String[] args) {

		        LinkedList<Integer> list = new LinkedList<>();

		        // -------------------- ADD OPERATIONS --------------------
		        list.add(10);              // add at end
		        list.add(20);
		        list.add(30);

		        list.add(1, 15);           // add at index

		        list.addFirst(5);          // add at beginning
		        list.addLast(40);          // add at end

		        System.out.println("After Add Operations: " + list);


		        // -------------------- GET OPERATIONS --------------------
		        System.out.println("Get index 2: " + list.get(2));
		        System.out.println("First element: " + list.getFirst());
		        System.out.println("Last element: " + list.getLast());


		        // -------------------- UPDATE OPERATION --------------------
		        list.set(2, 100);          // updating index 2 value
		        System.out.println("After Set (update): " + list);


		        // -------------------- SEARCH OPERATIONS --------------------
		        System.out.println("Contains 20? " + list.contains(20));
		        System.out.println("Index of 40: " + list.indexOf(40));

		        // -------------------- REMOVE OPERATIONS --------------------
		        list.remove();             // removes first
		        list.removeLast();         // removes last
		        list.remove(1);            // removes element at index
		        list.remove(Integer.valueOf(20)); // removes value 20

		        System.out.println("After Remove Operations: " + list);

		        // -------------------- QUEUE OPERATIONS --------------------
		        System.out.println("Peek: " + list.peek());   // shows first
		        System.out.println("Poll: " + list.poll());   // removes first
		        list.offer(200);                              // add at end

		        System.out.println("After Queue Operations: " + list);
		        // -------------------- SIZE --------------------
		        System.out.println("Size: " + list.size());


		        // -------------------- CLEAR --------------------
		        list.clear();
		        System.out.println("After Clear: " + list);
		
	}
}
