package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Find the largest and smallest elements in an ArrayList of integers.
public class Problem05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++) 
        	list.add(sc.nextInt());
        
        int max = Collections.max(list);
        
        int min = Collections.min(list);
        
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        sc.close();

	}
}
