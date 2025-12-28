package com.collections.queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(char ch: str.toCharArray()) {
			stack.push(ch);
		}
		
		String rev = "";
		while(!stack.isEmpty()) {
			rev = rev + stack.pop();
		}
		
		System.out.println("Reversed: " + rev);

	}
}
