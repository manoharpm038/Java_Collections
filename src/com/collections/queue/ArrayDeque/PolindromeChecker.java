package com.collections.queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PolindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toLowerCase();
		
		ArrayDeque<Character> dq = new ArrayDeque<>(); 
		for(char c: word.toCharArray()) {
			dq.addLast(c);
		}
		
		boolean isPolindrome = true;
		while(dq.size() > 1) {
			if(!dq.removeFirst().equals(dq.removeLast())) {
				isPolindrome = false;
				break;
			}
		}
		if(isPolindrome) {
			System.out.println(word + " is a Polindrome.");
		} else {
			System.out.println(word + " is not a Polindrome.");
		}
	}
}
