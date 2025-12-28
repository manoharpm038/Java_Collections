package com.collections.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < n1; i++) {
            list.add(sc.next());
        }
        String target = sc.next();
      
        int firstIndex = list.indexOf(target);
        int lastIndex = list.lastIndexOf(target);
        
        if (firstIndex == -1) {
            System.out.println("\""+ target + "\"" + " is not present in the list.");
        } else {
            System.out.println("First occurrence of " + target + ": " + firstIndex);
            System.out.println("Last occurrence of " + target + ": " + lastIndex);
        }
       
        sc.close();

	}

}
