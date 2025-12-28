package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

// Remove all duplicate elements from an ArrayList of integers.

// Input: 10 20 20 30 10
// Output: 10 20 30
public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        	list.add(sc.nextInt());

        ArrayList<Integer> result = new ArrayList<>();
        for(int num : list) {
            if(!result.contains(num)) 
            	result.add(num);
        }

        for(int num : result) 
        	System.out.print(num + " ");
        sc.close();

	}
}
