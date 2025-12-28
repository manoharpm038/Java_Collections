
// ----------------------------------------------------------------------------------------------
package com.collections.arraylist;

// hasNext() -> It checks next element is present or not
// next() -> It will return the next element move to the next element
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayIteratorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> students = new ArrayList<>();
		// Inserting Elements
		students.add("manu");
		students.add("sachi");
		students.add("chai");
		students.add("paddu");
		students.add("paru");
		students.add("pabha");
		
		// Get the Iterator for the ArrayList
		Iterator<String> itr = students.iterator();
		
		// Use iterator to loop through the arrayList
		while(itr.hasNext()) {
			String student = itr.next();
			System.out.print(student + " ");
		}
		System.out.println("==========================================");
		
		// forEach method
        students.forEach(System.out::println);

        System.out.println("==========================================");

        // Forward using ListIterator
        ListIterator<String> itr1 = students.listIterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }

        System.out.println("\n==========================================");

        // Backward using ListIterator
        ListIterator<String> itr2 = students.listIterator(students.size()); // start at end
        while (itr2.hasPrevious()) {
            System.out.print(itr2.previous() + " ");
        }
	}
}
