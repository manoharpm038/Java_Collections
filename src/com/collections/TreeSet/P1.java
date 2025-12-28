package com.collections.TreeSet;
import java.util.*;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());
		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(400);
		ts.add(500);
		
		System.out.println(ts + " ");
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(100);
		ts1.add(200);
		ts1.add(300);
		ts1.add(400);
		ts1.add(500);
		
		System.out.println("HeadSet(400): " +ts1.headSet(400));  // HeadSet(400): [100, 200, 300]
		System.out.println("tailSet(400): " +ts1.tailSet(400));   // tailSet(400): [400, 500]
		
		System.out.println("HeadSet(250): " +ts1.headSet(250));   // HeadSet(250): [100, 200]
		System.out.println("tailSet(250): " +ts1.tailSet(250));   // tailSet(250): [300, 400, 500]

		System.out.println("SubSet(125, 300): " + ts1.subSet(125, 300)); // SubSet(125, 300): [200]

	}
}
