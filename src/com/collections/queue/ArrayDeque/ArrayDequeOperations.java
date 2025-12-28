package com.collections.queue.ArrayDeque;
import java.util.*;
public class ArrayDequeOperations {

	public static void main(String[] args) {
		// Create an ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // ---------------------------
        // 1. Add Elements
        // ---------------------------
        deque.add("A");          // adds at tail
        deque.addFirst("B");     // adds at head
        deque.addLast("C");      // adds at tail
        deque.offer("D");        // adds at tail
        deque.offerFirst("E");   // adds at head
        deque.offerLast("F");    // adds at tail

        System.out.println("After adding elements: " + deque);

        // ---------------------------
        // 2. Access Elements (peek)
        // ---------------------------
        System.out.println("\nFirst element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // ---------------------------
        // 3. Remove Elements
        // ---------------------------
        deque.removeFirst();    // removes from head
        deque.removeLast();     // removes from tail
        deque.pollFirst();      // removes from head
        deque.pollLast();       // removes from tail

        System.out.println("\nAfter removals: " + deque);

        // ---------------------------
        // 4. Add few more for iteration demo
        // ---------------------------
        deque.add("X");
        deque.add("Y");
        deque.add("Z");

        System.out.println("\nCurrent Deque: " + deque);

        // ---------------------------
        // 5. Iterating through Deque
        // ---------------------------

        System.out.println("\nIteration using for-each loop:");
        for (String element : deque) {
            System.out.print(element + " ");
        }

        System.out.println("\n\nIteration using Iterator (forward):");
        Iterator<String> it = deque.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n\nIteration using DescendingIterator (reverse):");
        Iterator<String> rev = deque.descendingIterator();
        while (rev.hasNext()) {
            System.out.print(rev.next() + " ");
        }

        // ---------------------------
        // 6. Other Utility Methods
        // ---------------------------
        System.out.println("\n\nSize of deque: " + deque.size());
        System.out.println("Is deque empty? " + deque.isEmpty());

        // Clear all elements
        deque.clear();
        System.out.println("After clear(): " + deque);

	}
}
