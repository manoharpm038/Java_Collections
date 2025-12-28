package com.collections.queue.ArrayDeque;

import java.util.ArrayDeque;

public class StackEx {

	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);  // [30, 20, 10]

        stack.pop();  // removes top (30)
        System.out.println(stack);  // [20, 10]

	}

}
