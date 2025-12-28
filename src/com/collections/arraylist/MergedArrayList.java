package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MergedArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the number of colors for the first list (n1)
        int n1 = sc.nextInt();
        // TODO: Create an ArrayList to store first list of colors
        ArrayList<String> al1 = new ArrayList<>();
        // TODO: Read and add n1 colors to the first ArrayList
        for(int i = 0; i < n1; i++) {
            al1.add(sc.next());
        }
        // TODO: Read the number of colors for the second list (n2)
        int n2 = sc.nextInt();
        // TODO: Create an ArrayList to store second list of colors
        ArrayList<String> al2 = new ArrayList<>();
        // TODO: Read and add n2 colors to the second ArrayList
        
        for(int i = 0; i < n2; i++) {
            al2.add(sc.next());
        }
        // TODO: Merge both ArrayLists into a new ArrayList
        System.out.print("List of first array: ");
        for(String a1: al1) {
            System.out.print(a1 + " ");
        }
        System.out.println();
        System.out.print("List of second array: ");
        for(String a2: al2) {
            System.out.print(a2 + " ");
        }
        System.out.println();
        // TODO: Print all three lists as per the output format
        ArrayList<String> mergedList = new ArrayList<>(al1);
        mergedList.addAll(al2);

        System.out.print("New array: ");
        for(String ml: mergedList) {
            System.out.print(ml + " ");
        }
        sc.close();
    }
}
