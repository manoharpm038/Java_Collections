package com.collections.HashMap;
import java.util.Collection;
/*
PROBLEM STATEMENT: 
Take input of student ids and student names from user and add it to map where 
id happensnto be key and names happens to be values
use "MAP VIEWS" to extract 

keys(keySet()),
values(values()),
key value pairs(entrySet()) and print the data by iterating using iterator.

*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class DemoHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		
		for(int i = 0; i <= n; i++) {
			System.out.println("Enter Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			students.put(id, name);
		}
		
		System.out.println("Student IDs");
		Set<Integer> keys= students.keySet();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Student Names: ");
		Collection<String> names=students.values();
		Iterator<String> itr2 = names.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("Student Ids and Names: ");
		Set keyvalues = students.entrySet();
		Iterator itr3 = keyvalues.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}

	}
}
