package com.collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingCollcetionDemo {

	public static void main(String[] args) {
		
		//List maintains Insertion order and allows duplicates
		List al = new ArrayList();
		
		al.add("Rahul");
		al.add("Meena");
		al.add("Akshay");
		al.add("Rohit");
		
		System.out.println(al);
		
		//sorting list using Collections.sort
		//Collections.sort can be used to sort arraylist Linkedlist,vector
		//we can not sort Set directly as Set uses Hashing
		
		/*Collections.sort() method invokes compareTo() method of Comparable.
		Collections.sort() method invokes compare() method of Comparator.
		Comparable is used for sorting the List elements. Comparator is used for sorting List, Set, Map types.
		If there are primitives then the elements are sorted in natural order.*/
		
		Collections.sort(al);
		
		//we can still add new elements to the arraylist
		al.add("Hello");
		
		System.out.println(al);
		
		List li = new LinkedList();
		
		li.add(20);
		li.add(10);
		li.add(30);
		li.add(20);
		
		System.out.println(li);
		
		Collections.sort(li);
		
		System.out.println(li);
		
	}
	
}
