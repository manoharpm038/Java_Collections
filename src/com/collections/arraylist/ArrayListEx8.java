package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read the number of colors (n)
        int n = sc.nextInt();
        
        // TODO: Create an ArrayList to store color names
        ArrayList<String> al1 = new ArrayList<>();
        
        // TODO: Read and add n color names to the ArrayList
        for(int i = 0; i < n; i++) {
            al1.add(sc.next());
        }
        
        // TODO: Print the list before swapping
        System.out.println("Array list before Swap: ");
        for(String a1: al1) {
            System.out.println(a1);
        }
        
        // TODO: Swap the first and third elements if possible
        Collections.swap(al1,0,2);
        
        // TODO: Print the list after swapping
        System.out.println("Array list after Swap: ");
        for(String a1: al1) {
            System.out.println(a1);
        }
        sc.close();
    }
}