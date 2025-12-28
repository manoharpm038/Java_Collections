/*
 This Java program:
Creates an ArrayList to store school supply items (like books, pens, etc.).
Removes items that are already purchased.
Finally prints the remaining items left to buy.
 */
package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx7 {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	
	        // Create an ArrayList to store school supplies
	        ArrayList<String> al = new ArrayList<>();
	        
	        // Read input for the number of items
	        int n = sc.nextInt();
	        
	        // Add items to the school supplies list
	        for(int i = 0; i < n; i++) {
	            al.add(sc.next());
	        }
	        
	        // Remove purchased items from the list
	        int purchasedCount = sc.nextInt();
	        for(int i = 0; i < purchasedCount; i++) {
	            String item = sc.next();
	            al.remove(item);
	        }
	        
	        // Print the remaining items on the school supplies list
	        for(int i = 0; i < al.size(); i++) {
	            System.out.print(al.get(i));
	            if(i != al.size()-1) {
	                System.out.print(", ");
	            }
	        }
		}
	}
// System.out.println(String.join(", ", al));
