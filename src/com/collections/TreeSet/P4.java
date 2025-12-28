package com.collections.TreeSet;
import java.util.*;

public class P4 {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);

	        int n1 = Integer.parseInt(sc.next()); // Read count safely
	        TreeSet<String> ts1 = new TreeSet<>();
	        for (int i = 0; i < n1; i++) {
	            ts1.add(sc.next());
	        }

	        int n2 = Integer.parseInt(sc.next()); // Read count safely
	        TreeSet<String> ts2 = new TreeSet<>();
	        for (int i = 0; i < n2; i++) {
	            ts2.add(sc.next());
	        }

	        TreeSet<String> union = new TreeSet<>(ts1);
	        union.addAll(ts2);

	        TreeSet<String> intersection = new TreeSet<>(ts1);
	        intersection.retainAll(ts2);

	        TreeSet<String> difference = new TreeSet<>(ts1);
	        difference.removeAll(ts2);

	        
	        if (union.isEmpty()) System.out.println("NO PRODUCTS");
	        else {
	            for (String prod : union) System.out.print(prod + " ");
	            System.out.println();
	        }

	        
	        if (intersection.isEmpty()) System.out.println("NO PRODUCTS");
	        else {
	            for (String prod : intersection) System.out.print(prod + " ");
	            System.out.println();
	        }

	        
	        if (difference.isEmpty()) System.out.println("NO PRODUCTS");
	        else {
	            for (String prod : difference) System.out.print(prod + " ");
	            System.out.println();
	        }

	        sc.close();

	}
}
