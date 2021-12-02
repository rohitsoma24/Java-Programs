package Java.interviewpgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ToFindThirdHighestinArray {
	
	public static void main(String[] args) {

		Integer []a={1,3,8,4,2,6,10,99,86,86,96,96};
		
		//Converting Integer array to Set to remove duplicates
		Set<Integer> s= new HashSet<Integer>(Arrays.asList(a));
			
		//Again converting Set to Arraylist to get elements at specified index using get method
		List<Integer> li = new ArrayList<Integer>(s);
		
		//sorting the list and works only for lists
		Collections.sort(li);
		
		System.out.println(li);
		
		System.out.println(li.size());
		
		//indexing in Arraylist starts from 0
		int n=li.size()-3;
		
		System.out.println(n);
		
		//get method throws an IndexOutOfBoundsException if the index is out of range (index=size())
		System.out.println(li.get(n));

		}

}
