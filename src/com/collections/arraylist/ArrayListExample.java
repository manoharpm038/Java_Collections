package com.collections.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();

        // Add
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        // Insert
        fruits.add(1, "Mango");
        System.out.println("After Insertion: " + fruits);

        // Update
        fruits.set(2, "Orange");
        System.out.println("After Update: " + fruits);

        // Access
        System.out.println("Element at index 1: " + fruits.get(1));

        // Remove
        fruits.remove("Banana");
        System.out.println("After Removal: " + fruits);

        // Check
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // Size
        System.out.println("Size: " + fruits.size());

        // Iterate
        System.out.print("All items: ");
        for (String f : fruits) {
            System.out.print(f + " ");
        }
        
        fruits.getFirst();
        
        fruits.getLast();
        
        fruits.indexOf("Mango");

	}
}
