package com.collections.queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // TODO: Read the input string
        String str = sc.next();
        // TODO: Use ArrayDeque to store characters of the string
        ArrayDeque<Character> adq = new ArrayDeque<>();
        // TODO: Reverse the string using ArrayDeque
        for(char ch: str.toCharArray()) {
            adq.add(ch);
        }
        // TODO: Print the reversed string
        String rev = "";
        while(!adq.isEmpty()) {
            rev = rev + adq.removeLast();
        }
        System.out.println(rev);
        sc.close();

	}
}
