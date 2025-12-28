package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

// Calculate the sum and average of elements in an ArrayList of integers.
public class Problem08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int sum = 0;
        for(int i=0;i<n;i++) {
            int num = sc.nextInt();
            list.add(num);
            sum += num;
        }
        
        double avg = sum / (double)n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        sc.close();

	}
}
