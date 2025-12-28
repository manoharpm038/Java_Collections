package com.collections.interator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraytList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.println(al);
		
		System.out.println("=========================================================");
		System.out.print("[");
		for(int i = 0; i <= al.size()-1; i++) {
			System.out.print(al.get(i));
			if(i != al.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		System.out.println("=========================================================");
		
		System.out.print("[");
		int count = 0;
		for(Object x: al) {
			System.out.print(x+" ");
			if(count != al.size()-1) {
				System.out.print(", ");
			}
			count++;
		}
		System.out.println("]");
		
		System.out.println("=========================================================");
		
		Iterator itr = al.iterator();
		System.out.print("[");
		count = 0;
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
			if(count != al.size()-1) {
				System.out.print(", ");
				count++;
			}
		}
		System.out.println("]");
	}
}
