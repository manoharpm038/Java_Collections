package com.collections.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("Start");
        list.addLast("End");
        
        System.out.println("LinkedList: " + list);
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        
        list.remove("B");
        list.removeFirst();
        list.removeLast();
        System.out.println("After Removal: " + list);
        
        list.set(1, "Updated");
        System.out.println("After Update: " + list);
        
        System.out.println("Contains A? " + list.contains("A"));
        System.out.println("Size: " + list.size());
        
        System.out.println("Iterating:");
        for(String s : list) {
            System.out.println(s);
        }
	}
}
