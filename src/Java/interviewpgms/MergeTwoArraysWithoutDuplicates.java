package Java.interviewpgms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/*this code demonstartes set methods on two arrays*/
public class MergeTwoArraysWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "difference"; //intersection, difference, Union
		
		Integer [] m = {10,20,45,35,21,10,90,80};
		
		Integer [] n = {10,20,100,75,85,95,90};
		
		Set<Integer> a = new HashSet<Integer>(Arrays.asList(m));

		Set<Integer> b = new HashSet<Integer>(Arrays.asList(n));
		
		Set<Integer> res = new HashSet<Integer>(a);
		
		//Union of two arrays(distinct elements only)
		
		switch(input) {
		
		case "Union": res.addAll(b);
		System.out.println("Union of two arrays: "+ res);
		break;
		
		case "intersection": res.retainAll(b);
		System.out.println("Intersection of two arrays :" + res);
		break;
		
		case "difference": res.removeAll(b);
		System.out.println("Difference of two arrays: "+ res);
		break;
		
		default: System.out.println("Enter input");
		
		}
		
	}

}
