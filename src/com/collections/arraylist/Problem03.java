package com.collections.arraylist;
// Check if a given integer exists in an ArrayList. Print "Found" if it exists, otherwise "Not Found".
import java.util.ArrayList;
import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) 
        	list.add(sc.nextInt());
        
        int value = sc.nextInt();
        
        if(list.contains(value)) 
        	System.out.println("Found");
        else 
        	System.out.println("Not Found");
        sc.close();
	}
}
