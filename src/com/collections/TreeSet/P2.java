package com.collections.TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

// finding min , max, and floor , ceileng number
public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println(set);
		
		System.out.println("Max: " + set.last());
		System.out.println("Min: " + set.first());
		
		int x = sc.nextInt();
		
		System.out.println("Floor value: " + set.floor(x));
		System.out.println("Ceiling value: " + set.ceiling(x));
	
	}
}
