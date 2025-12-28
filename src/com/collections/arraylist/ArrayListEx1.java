package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 1; i <= size; i++) {
			int n = sc.nextInt();
			al.add(n);
		}
		
		for(int num : al) {
			System.out.print(num + " ");   // 12 13 14 15 16
		}
		System.out.println();
		
		System.out.println(al.size());  // length : 5
	
		System.out.println(al);      // [12, 13, 14, 15, 16]
	}
}
