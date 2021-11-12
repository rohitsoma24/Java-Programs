package com.collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Here we are implementing Comparable because we want to sort Student object using only one attribute i.e Name
Comparable:
Comparable provides a single sorting sequence.
In other words, we can sort the collection on the basis of a single element such as id, name, and price.
Comparator:
The Comparator provides multiple sorting sequences. 
In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.*/


class Student1 implements Comparable <Student1>
{
	public String name;
	
	public Student1(String name)
	{
		this.name=name;
	}
	
	@Override
	public int compareTo(Student1 person) {
		// TODO Auto-generated method stub

		return name.compareTo(person.name);
	}
	
	
}

public class SortingUserDefinedObject {
	
	public static void main(String[] args) {
		
		List<Student1> al = new ArrayList<Student1>();
		
		al.add(new Student1("Rohit"));
		al.add(new Student1("Rahul"));
		al.add(new Student1("Akshay"));

		/*Collections.sort() method invokes compareTo() method of Comparable.
		Collections.sort() method invokes compare() method of Comparator.
		Comparable is used for sorting the List elements. Comparator is used for sorting List, Set, Map types.
		If there are primitives then the elements are sorted in natural order.
		otherwise you can customise the compareTo() or compare() methods according to the sorting technique you want to have.	*/	

		Collections.sort(al);
		
		for (Student1 s:al)
		{
			System.out.println(s.name);
		}
	}

}
