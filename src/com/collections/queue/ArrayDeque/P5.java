package com.collections.queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

// Rotate the queue k times using ArrayDeque(Right Rotation)
public class P5 {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>(List.of(1,2,3,4,5));
		int k = 2;
		
		for(int i = 0; i < k; i++) {
			int front = dq.poll();
			dq.offer(front);
		}	
		System.out.println("After Rotating: " + dq);
	}
}
