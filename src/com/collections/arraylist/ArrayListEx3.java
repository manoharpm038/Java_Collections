package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Monkey");
		animals.add("Lion");
		animals.add("cheetha");
		animals.add("tiger");
		animals.add("cat");
		
		// The enhanced-for loop works bcz arrayList implements iterable
		for(String s : animals) {
			System.out.print(s + " ");           // Monkey Lion cheetha tiger cat 
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		
		for(int i = 0; i < animals.size(); i++) {
			System.out.print(animals.get(i));  // Monkey, Lion, cheetha, tiger, cat
			if(i != animals.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println(animals);  // [Monkey, Lion, cheetha, tiger, cat]
		System.out.println("------------------------------------------------------------------------------");
	}
}
