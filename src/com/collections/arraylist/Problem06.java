package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

// Clear all elements from an ArrayList and check if it is empty.
public class Problem06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++) 
        	list.add(sc.nextInt());
        
        list.clear();
        
        System.out.println("ArrayList cleared. Is empty? " + list.isEmpty());
        sc.close();

	}
}
