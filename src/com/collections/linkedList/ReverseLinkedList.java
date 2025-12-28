package com.collections.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // Read the number of songs
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        // Create and fill the linked list
        LinkedList<String> playlist = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String song = sc.nextLine();
            playlist.add(song);
        }
        
        // Reverse the linked list
        reverseLinkedList(playlist);
        
        // Print the reversed linked list
        for (String song : playlist) {
            System.out.print(song + " ");
        }
        
        sc.close();
    }
    
    // Function to reverse the linked list
    public static void reverseLinkedList(LinkedList<String> playlist) {
        int left = 0;
        int right = playlist.size() - 1;
        
        while (left < right) {
            // Swap elements at left and right indices
            String temp = playlist.get(left);
            playlist.set(left, playlist.get(right));
            playlist.set(right, temp);
            
            left++;
            right--;
        }

	}

}
