/*
🟦 2. LinkedList as a Stack (LIFO)
⚙️ Working Principle:

Push (add) → element added at the front (head)

Pop (remove) → element removed from the front (head)

📘 Stack Operations in LinkedList:

Operation	     Method			Description
Push	        push(E e)	Adds element at the head
Pop	            pop()		Removes element from the head
Peek	        peek()		Returns (but does not remove) the top element
 */
package com.collections.linkedList;

import java.util.LinkedList;

public class LinkedListAsStack {

	public static void main(String[] args) {
		LinkedList<String> stack = new LinkedList<>();

        // Push (add at start)
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack: " + stack);  // [C, B, A]

        // Peek (see top element)
        System.out.println("Top: " + stack.peek()); // C

        // Pop (remove from start)
        stack.pop();
        System.out.println("After Pop: " + stack);  // [B, A]

	}
}

/*
Top -> [C] <-> [B] <-> [A]
pop() removes C (top)
push() adds new element at head
*/
