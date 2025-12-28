package com.collections.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		/*
		 TreeSet
		 
		 - Internally make use Red black balanced binary search tree
		 - Duplicates are not allowed
		 - It gives results in ascending order
		 - seraching become more efficeint
		 - It implements the NavigableSet interface, which extends SortedSet and Set.
		 - Null values are not allowed
		 
		 IMPORTANT OPERATIONS
		 
		 | Method                 | Description                                | Example                       |
| ---------------------- | ------------------------------------------ | ----------------------------- |
| `add(E e)`             | Adds element (if not duplicate).           | `ts.add(20);`                 |
| `addAll(Collection c)` | Adds all elements from another collection. | `ts.addAll(list);`            |
| `remove(Object o)`     | Removes specific element.                  | `ts.remove(10);`              |
| `clear()`              | Removes all elements.                      | `ts.clear();`                 |
| `contains(Object o)`   | Checks if element exists.                  | `ts.contains(30);`            |
| `isEmpty()`            | Checks if TreeSet is empty.                | `ts.isEmpty();`               |
| `size()`               | Returns total elements.                    | `ts.size();`                  |
| `first()`              | Returns first (lowest) element.            | `ts.first();`                 |
| `last()`               | Returns last (highest) element.            | `ts.last();`                  |
| `higher(E e)`          | Returns least element greater than given.  | `ts.higher(20);`              |
| `lower(E e)`           | Returns greatest element less than given.  | `ts.lower(20);`               |
| `ceiling(E e)`         | Returns element ≥ given element.           | `ts.ceiling(25);`             |
| `floor(E e)`           | Returns element ≤ given element.           | `ts.floor(25);`               |
| `pollFirst()`          | Removes and returns first element.         | `ts.pollFirst();`             |
| `pollLast()`           | Removes and returns last element.          | `ts.pollLast();`              |
| `iterator()`           | Returns iterator to traverse TreeSet.      | `Iterator i = ts.iterator();` |
| `descendingIterator()` | Returns iterator in reverse order.         | `ts.descendingIterator();`    |


Commonly Used Constructors
| Constructor                | Description                                                    |
| -------------------------- | -------------------------------------------------------------- |
| `TreeSet()`                | Creates an empty TreeSet with natural ordering.                |
| `TreeSet(Comparator comp)` | Creates a TreeSet with custom comparator (user-defined order). |
| `TreeSet(Collection c)`    | Creates a TreeSet and adds all elements from the collection.   |

		 
		 */

	}
}
