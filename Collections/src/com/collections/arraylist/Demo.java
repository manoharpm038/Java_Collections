package com.collections.arraylist;

import java.util.ArrayList;

public class Demo {
// it is not fixed length
// accept heterogenous elements also
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		System.out.println(al.size());
		System.out.println(al);
		
		al.add("Manu");
		al.add(3.17);
		al.add(true);
	
		System.out.println(al);
		
		System.out.println(al.contains(100)); // element present or not
		System.out.println(al.get(2));  // get index 2 elemet
		System.out.println(al.indexOf(500)); // index
		System.out.println(al.isEmpty());
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.remove(2));

	}

}
