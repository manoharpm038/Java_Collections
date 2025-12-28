package com.collections.queue.ArrayDeque;
// Perform stack operations using ArrayDeque.
import java.util.ArrayDeque;

public class P2 {

	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top: " + stack.peek());

        stack.pop();
        System.out.println("After pop: " + stack);

	}
}
