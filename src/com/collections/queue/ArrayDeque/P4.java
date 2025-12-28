package com.collections.queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

// Use ArrayDeque to check if parentheses are balanced.
public class P4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine(); 
        System.out.println(isBalanced(exp) ? "Balanced" : "Not Balanced");
    }

    static boolean isBalanced(String exp) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char ch : exp.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } 
            else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty())
                	return false;
                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
            // ignore all other characters like letters, +, -, *, etc.
        }
        return stack.isEmpty();
    }
}
