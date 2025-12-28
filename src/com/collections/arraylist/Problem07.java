package com.collections.arraylist;
// Reverse the elements of an ArrayList and print the result.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++) 
        	list.add(sc.nextInt());
        
        Collections.reverse(list);
        
        System.out.print("Reversed ArrayList: ");
        for(int num : list)
        	System.out.print(num + " ");
        sc.close();

	}
}
