/*
🟩 1. LinkedList as a Queue (FIFO)
⚙️ Working Principle:

Enqueue (add) → element is added at the end (tail)

Dequeue (remove) → element is removed from the front (head)

📘 Queue Operations in LinkedList:

Operation	Method	Description
Enqueue	offer(E e)	Adds element at the tail
Dequeue	poll()	Removes element from the head
Peek	peek()	Returns (but does not remove) the head element
 */
package com.collections.linkedList;

import java.util.LinkedList;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();

        // Enqueue (add at end)
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);  // [A, B, C]

        // Peek (see first element)
        System.out.println("Front: " + queue.peek()); // A

        // Dequeue (remove from front)
        queue.poll();
        System.out.println("After Dequeue: " + queue); // [B, C]

	}
}

/*
Head -> [A] <-> [B] <-> [C] <- Tail
poll() removes A (front)
offer() adds new element at tail
*/
