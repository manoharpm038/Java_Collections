package com.collections.queue.ArrayDeque;
/*
Deque → ArrayDeque

📖 Description:

Resizable array implementation of Deque.
Faster than Stack and LinkedList for stack/queue operations.
No null allowed.
*/
import java.util.ArrayDeque;

public class P9 {

	public static void main(String[] args) {
		ArrayDeque<String> dq = new ArrayDeque<>();
		dq.add("A");
		dq.addFirst("B");
		dq.addLast("C");
		dq.add("M");
		dq.add("S");
		System.out.println(dq); // [B, A, C]
		
		dq.remove("M");
		System.out.println(dq);
		
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);

	}
}
