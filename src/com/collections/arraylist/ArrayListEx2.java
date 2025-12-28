package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 1; i <= size; i++) {
			int item = sc.nextInt();
			al.add(item);
		}
		
		for(int num: al) {
			System.out.print(num + " ");  // 12 13 14 15 16 
		}
		
		int index = sc.nextInt();
		
		System.out.println("Element at "+ index + " Index: " + al.get(index));  // get the index position element
	}
}
