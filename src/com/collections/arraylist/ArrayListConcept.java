package com.collections.arraylist;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		/*
		 ARRAYLIST
		  -> <<List>> <-- Absract List <- Array List
		  
		 -> ArrayList internally make use of Dynamic Array.
		 
		 -> ArrayList is a resizable (dynamic) array in Java 
		 -> ArrayList is part of the java.util package and belongs to the Collections Framework.
		 -> Unlike normal arrays (which have a fixed size), an 
		    ArrayList can grow or shrink automatically when elements are added or removed.
		 */
		
		/*
		 Important Operations on ArrayList
		 
	1	 list.add("Mango");                                // adds at end
		 
	2	 list.add(1, "Grapes");                            // adds at specific index
		 
	3	 String fruit = list.get(2);                       // access using index
		 
	4	 list.set(1, "Orange");                            // update value at index 1
		 
	5	 list.remove(2);                                   // remove by index
		 
	6    list.remove("Mango");                             // remove by value
	     
	7	 boolean present = list.contains("Apple");         // Check if Element Exists
		 
	8	 int size = list.size();                           // Get Size
		 
	9	 list.clear();                                     // clear the list
		 
	10	 boolean empty = list.isEmpty();                   // Check list is Empty or not
		 
		 
	11	 // Iterate Through Elements
		 
		 for (String s : list) {
    	 	System.out.println(s);
		 }
		 
	12   //  Convert to Array
	
		Object[] arr = list.toArray();
		
		
		Disadvanteges Of Arrays: 
		
		1. Arrays are static (It can not grow or shrink in size)
		2. Arrays accept one Homogeneous types of data
		3. Arrays cannot utilize dispersed memory
		
		
		| Method                | Description                |
| --------------------- | -------------------------- |
| `add(E e)`            | Adds an element            |
| `add(int index, E e)` | Inserts element at index   |
| `get(int index)`      | Returns element at index   |
| `set(int index, E e)` | Replaces element           |
| `remove(int index)`   | Removes element at index   |
| `size()`              | Returns number of elements |
| `clear()`             | Removes all elements       |
| `contains(Object o)`  | Checks if element exists   |
| `isEmpty()`           | Checks if list is empty    |

		
		 */

	}

}
