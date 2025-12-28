package com.collections.arraylist;
/*
List → AbstractList → ArrayList

📖 Description:

Ordered collection (preserves insertion order).

Allows duplicates.

Backed by a dynamic array.

Best for random access (index-based).	
*/
//it is not fixed length
//accept heterogenous elements also
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		//al.set(130, 3);
		
		System.out.println(al);
		
		al.add("Manu");
		al.add(3.17);
		al.add(true);
		al.add(0,5000);   // add element particulr position
		al.set(1,6000); // update that particular index position
	
		System.out.println(al);
		
		System.out.println(al.contains(100)); // element present or not
		System.out.println(al.get(2));       // get index 2 elemet
		System.out.println(al.indexOf(500));  // index
		System.out.println(al.isEmpty());
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.remove(2));	
	}
}
