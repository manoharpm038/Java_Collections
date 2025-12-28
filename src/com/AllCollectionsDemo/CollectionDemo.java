package com.AllCollectionsDemo;

/*
1. LIST

ArrayList
LinkedList

2. Queue

ArrayDeque
PriorityQueue

3. Set

TreeSet
HashSet
LinkedHashSet

 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		 // 1️⃣ HashSet - Unordered, unique elements
        System.out.println("1️⃣ HashSet:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // duplicate ignored
        hashSet.add(null); // one null allowed
        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains Banana? " + hashSet.contains("Banana"));
        hashSet.remove("Banana");
        System.out.println("After remove: " + hashSet);
        System.out.println();

        // 2️⃣ LinkedHashSet - Maintains insertion order
        System.out.println("2️⃣ LinkedHashSet:");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("A"); // duplicate ignored
        System.out.println("LinkedHashSet (ordered): " + linkedHashSet);
        System.out.println();

        // 3️⃣ TreeSet - Sorted, no null, unique elements
        System.out.println("3️⃣ TreeSet:");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);
        System.out.println("TreeSet (sorted): " + treeSet);
        System.out.println("First: " + treeSet.first() + ", Last: " + treeSet.last());
        System.out.println("Higher(20): " + treeSet.higher(20));
        System.out.println("Lower(20): " + treeSet.lower(20));
        System.out.println();

        // 4️⃣ ArrayList - Ordered, allows duplicates & nulls
        System.out.println("4️⃣ ArrayList:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("Java"); // duplicate
        arrayList.add(null);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Get index 1: " + arrayList.get(1));
        arrayList.remove("C++");
        System.out.println("After remove: " + arrayList);
        System.out.println();

        // 5️⃣ LinkedList - Doubly linked list (List + Queue)
        System.out.println("5️⃣ LinkedList:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.addFirst("Zero");
        linkedList.addLast("Three");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("PeekFirst: " + linkedList.peekFirst());
        linkedList.removeLast();
        System.out.println("After removeLast: " + linkedList);
        System.out.println();

        // 6️⃣ ArrayDeque - Double-ended queue (fast stack/queue)
        System.out.println("6️⃣ ArrayDeque:");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("A");
        arrayDeque.addFirst("B");
        arrayDeque.addLast("C");
        System.out.println("ArrayDeque: " + arrayDeque);
        System.out.println("PeekFirst: " + arrayDeque.peekFirst() + ", PeekLast: " + arrayDeque.peekLast());
        arrayDeque.pollFirst(); // remove first
        System.out.println("After pollFirst: " + arrayDeque);
        System.out.println();

        // 7️⃣ PriorityQueue - Natural order (min-heap)
        System.out.println("7️⃣ PriorityQueue:");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.add(40);
        priorityQueue.add(10);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Peek (smallest): " + priorityQueue.peek());
        System.out.println("Poll (remove smallest): " + priorityQueue.poll());
        System.out.println("After poll: " + priorityQueue);

	}
}
