package com.collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		ll.add("manu");
		ll.add(3.17);
		System.out.println(ll);
		ll.add(3,999);
		System.out.println(ll);
		System.out.println("========================================================================");
		ArrayList al = new ArrayList();
		al.add(8);
		al.add(10);
		al.add(12);
		al.add(20);
		System.out.println("al -->" + al);
		System.out.println("ll -->" + ll);
		
		ll.add(al);
		System.out.println(ll);
		
		ll.addAll(0,al);
		System.out.println(ll);
		
		System.out.println(al.containsAll(ll));
		System.out.println(ll.containsAll(al));
		System.out.println("========================================================================");
		
		LinkedList stack = new LinkedList();
		stack.push(100);
	}

}
