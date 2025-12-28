package com.collections.arraylist;
// Merge two ArrayLists of integers into a single ArrayList and print the result.
import java.util.ArrayList;
import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // First ArrayList
        int n1 = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<n1;i++) 
        	list1.add(sc.nextInt());

        // Second ArrayList
        int n2 = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<n2;i++)
        	list2.add(sc.nextInt());

        // Merge
        list1.addAll(list2);

        // Print merged list
        System.out.print("Merged ArrayList: ");
        for(int num : list1) 
        	System.out.print(num + " ");
        sc.close();

	}
}
