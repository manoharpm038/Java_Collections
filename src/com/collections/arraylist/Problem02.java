/*
 Read n integers into an ArrayList. Then read an integer value from the user 
 and remove that value from the ArrayList. 
 Finally, print the updated ArrayList.
 */
package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Read the element to remove
        int value = sc.nextInt();

        // Remove element if exists
        list.remove(Integer.valueOf(value));

        // Print updated ArrayList
        System.out.print("Updated ArrayList: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();

	}
}
