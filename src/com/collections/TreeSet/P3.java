package com.collections.TreeSet;

/*
INPUT:
How many words:  
5
java
jaanu
janardhana
manaid
manu

Enter a Prefix: 
ja

OUTPUT: Matches: [jaanu, janardhana, java]
 */
import java.util.Scanner;
import java.util.TreeSet;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many words: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		TreeSet<String> set = new TreeSet<String>();
		
		for(int i = 0; i < n; i++) {
			set.add(sc.nextLine());
		}
		
		System.out.println("Enter a Prefix: ");
		String prefix = sc.nextLine();
		
		System.out.println("Matches: " + fetchByPrefix(set, prefix));

	}
	
	public static TreeSet<String> fetchByPrefix(TreeSet<String> set, String prefix) {
		
		TreeSet<String> result = new TreeSet<String>();
		
		for(String x: set) {
			if(x.startsWith(prefix)) {
				result.add(x);
			}
		}
		return result;
	}
}
