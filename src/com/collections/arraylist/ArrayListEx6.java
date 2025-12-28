package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // TODO: Read the number of elements (n)
        int n = sc.nextInt();
        
        // TODO: Create an ArrayList to store integers
        ArrayList<Integer> al1 = new ArrayList<>();
        
        // TODO: Read and add n integers to the ArrayList
        for(int i = 0; i < n; i++) {
            al1.add(sc.nextInt());
        }
        
        // TODO: Read the element to insert
        int element = sc.nextInt();
        
        // TODO: Insert the element at the first position
        al1.add(0, element);
        
        // TODO: Print the updated ArrayList
        System.out.println("Updated ArrayList: ");
        for(int ul: al1) {
            System.out.print(ul + " ");
        }
      
        sc.close();	 
	}
}
