package com.collections.queue.ArrayDeque;
import java.util.*;
public class P6 {

	public static void main(String[] args) {
		  ArrayDeque<Integer> dq = new ArrayDeque<>(List.of(10, 15, 20, 25, 30));

	        dq.removeIf(n -> n % 2 == 0);

	        System.out.println("After removing evens: " + dq);
	}
}
