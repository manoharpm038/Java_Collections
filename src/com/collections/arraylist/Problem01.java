/*
Problem:
Read n integers from the user, store them in an ArrayList, and print all elements.
Concepts used:
add(), get(), size()
 */
package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>(n);
		
		for(int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}
		
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i));
			if(i != al.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		System.out.println(al.size());
	}
}
