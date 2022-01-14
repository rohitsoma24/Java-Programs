package com.collection.demos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//Accenture Interview Question
/*this class illustrates the Set Collection:
 * Set(interface)<-AbstarctSet(Class)<--HashSet(Class)
 * 
 * Set: dosent allow duplicate values/ or it removes duplicate entries
 * 
 * HastSet: uses Hash Table to store elements in HashSet
 * 
 * */

// pgm to illustrate Set operations
public class SetEx{
	
	public static void main(String[] args) {
		
		Integer m[]=new Integer[]{1,2,3,4,8,9,0};
		Integer n[]=new Integer[]{1,3,7,5,4,0,7,5};
		
		Set<Integer> a = new HashSet<Integer>(); 		
		//adds all the elements of m to a
		a.addAll(Arrays.asList(m));
		
		Set<Integer> b = new HashSet<Integer>(Arrays.asList(n));
		
		//Now comes the operations:
		
		//Union: Combining all the elements of a and b
		
		Set<Integer> union = new HashSet<Integer>(a);
		//adds all the elements of b to union
		union.addAll(b);
		
		System.out.println("Elements of Union");
		System.out.println(union);
		
		//Intersection: only matching elements retained
		//Accenture Interview Question
		
		Set<Integer> intrersection = new HashSet<Integer>(a);
		
		//retains all the elements of b and deletes other elements from a(i.e which are not matching with b)
		intrersection.retainAll(b);
		
		System.out.println("Elements of intersection");
		System.out.println(intrersection);
		
		//Difference: only non matching elements are retained
		
		Set<Integer> difference = new HashSet<Integer>(a);
		
		//deletes all the elements of b from a(i.e only non matching elements are retained)
		difference.removeAll(b);
		
		System.out.println("Elements of difference");
		System.out.println(difference);
		
		
		
	}

}
