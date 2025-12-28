/*
 Problem:
Read n integers, then read an index and a new value. Replace the element at that index with the new value.
Concepts used:
set(index, element)
 */
package com.collections.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
               
        ArrayList<Integer> arr = new ArrayList<>(size);
        
        
        for(int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        
        // TODO: Read index and new value, update the ArrayList using set()
        int index = sc.nextInt();
        int element = sc.nextInt();
        
        arr.set(index, element);    // Update the value
        
        System.out.println("Updated ArrayList: " );
        for(int i = 0; i < size; i++) {
            System.out.print(arr.get(i));
            if(i != arr.size()-1) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
