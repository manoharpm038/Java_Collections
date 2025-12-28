package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        // Create an ArrayList to store student names
        ArrayList<String> al = new ArrayList<>();
        
        // Read input for the number of students
        int n = sc.nextInt();
        
        // Add the student names to the ArrayList
        for(int i = 0; i < n; i++) {
            al.add(sc.next());
        }
        
        // Print the student names in the order they were added
        for(int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i));
            if(i != al.size()-1) {
                System.out.print(", ");
            }
        }
	}
}
