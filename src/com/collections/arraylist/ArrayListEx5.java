package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of strings
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Create ArrayList
        ArrayList<String> arr = new ArrayList<>(n);

        // Step 3: Read the space-separated strings
        String[] inputs = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr.add(inputs[i]);
        }

        // Step 4: Read index and new string (for insertion)
        int index = sc.nextInt();
        sc.nextLine(); // consume newline
        String element = sc.nextLine();

        // Step 5: Insert the new element at given index
        arr.add(index, element);

        // Step 6: Print updated ArrayList after insertion
        System.out.print("Updated ArrayList: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i < arr.size() - 1) {
                System.out.print(" ");
            }
        }

        System.out.println(); // move to next line

        // Step 7: Read index for deletion and remove that element
        int index2 = sc.nextInt();
        arr.remove(index2);

        // Step 8: Print final ArrayList after deletion
        System.out.println("Final ArrayList after deletion: " + arr);

        sc.close();
    }
}
