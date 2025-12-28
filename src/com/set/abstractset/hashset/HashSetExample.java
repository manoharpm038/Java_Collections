package com.set.abstractset.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
        
        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // duplicate, ignored
        
        System.out.println("HashSet: " + set);
        
        // Removing element
        set.remove("Banana");
        
        // Check contains
        System.out.println("Contains Orange? " + set.contains("Orange"));
        
        // Traversal
        System.out.println("Traversal using Iterator:");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        // Size
        System.out.println("Size: " + set.size());
        
        // Clear
        set.clear();
        System.out.println("Empty after clear? " + set.isEmpty());

	}
}
