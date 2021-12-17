package Java.interviewpgms;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ThirdLargestElementInArray {
	public static void main(String[] args) {
		
		Integer a[]={ 99, 18, 58, 47, 91, 52, 91, 96, 66, 96, 89, 76, 18 };
		

		Set<Integer> s= new HashSet<Integer>(Arrays.asList(a));
		
		List<Integer> li =new ArrayList<Integer>(s);
		
		Collections.sort(li);
		
		//n is the size of ArrayList,and index in ArrayList Starts from 0
		//so there wont be any element at index n,it will give IndexOutOfBoundsException
		int n = li.size();
		
		//therefore n-1 will give last element,n-2 will give 2nd last element and so on
		int m = n-3;

		System.out.println(li);
		System.out.println(li.get(n-1));
		System.out.println(li.get(m));
		System.out.println(li.get(li.size()-3));
	
	}

}
