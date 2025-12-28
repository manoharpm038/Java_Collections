package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Step 1: Read number of elements
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // Step 2: Add elements
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Step 3: Read index and new value
        int index = sc.nextInt();
        int value = sc.nextInt();

        // Step 4: Insert element at specific index
        list.add(index, value);

        // Step 5: Print updated ArrayList
        System.out.print("Updated ArrayList: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();

	}
}
