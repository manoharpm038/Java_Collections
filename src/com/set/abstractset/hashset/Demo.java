package com.set.abstractset.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/*
* Set interface → AbstractSet → HashSet
* Uses a hash table internally for fast access.
 */
public class Demo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		// add()
		set.add("manu");  // Unordered — insertion order not guaranteed.
		set.add("sachi");
		set.add("chaithra");
		set.add("prabha");
		set.add("rathna");
		set.add("maadu");
		set.add("paddu");
		set.add("Parasu");
		set.add("mava1");
		set.add("mava2");
		set.add("manu"); // Stores unique elements (no duplicates).
		set.add(null);  //   Allows one null element.
		
		// contains()
		System.out.println(set.contains("manu")); // true
		
		System.out.println(set.contains("raju")); // false
		
		System.out.println(set.contains(null)); // true
		
		System.out.println(set.size());  // 11
		
		// iterate (several ways)
        System.out.println("iterate using for-each:");
        for (String s : set) {
            System.out.println("  " + s);
        }

        System.out.println("iterate using iterator and remove example:");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
        	String s = itr.next();
        	if("manu".equals(s)) {
        		itr.remove();  // safe removal
        	}
        }
		
        
        boolean res = set.remove("sachi");
        System.out.println(res); // true
        
        // set Union(U) set2
        HashSet<String> set2 = new HashSet<>(Arrays.asList("A","B","prabha",null));
        set.addAll(set2); 
        System.out.println(set);
        System.out.println(set2);
        
     // intersection --> set intersection copy
        HashSet<String> copy = new HashSet<>(set);
        copy.retainAll(new HashSet<>(Arrays.asList("C","A", null))); 
        System.out.println("intersection with {C,null}: " + copy);
        
        // difference
        copy = new HashSet<>(set);
        copy.removeAll(new HashSet<>(Arrays.asList("chaithra","bhavani","rathna","maadu","paddu")));
        System.out.println("after removeAll({null}): " + copy);
       
      //  set.clear();  // []
		System.out.println(set); 
	}
}
