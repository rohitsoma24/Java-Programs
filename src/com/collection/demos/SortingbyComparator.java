package com.collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	
	int id;
	String name;
	int age;
	
	Student(int id,String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	public String toString()
	{
		return this.id+" "+this.name+" "+this.age;
	}
	
}

class sortbyId implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		
		if(s1.id==s2.id)
			return 0;
		else if(s1.id>s2.id)
			return 1;
		else
		return -1;
	}

}

class sortbyName implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}
	

}

public class SortingbyComparator {

	public static void main(String[] args) {
		
		List<Student> al = new ArrayList <Student>();
		
		al.add(new Student(10,"Rohit",24));
		al.add(new Student(11, "Rahul", 23));
		al.add(new Student(12, "Sai", 21));
		
		Collections.sort(al,new sortbyId());
		
		for(Student s:al)
		{
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		
		Collections.sort(al, new sortbyName());
		for(Student s:al)
		{
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		System.out.println(al);
		
	}
	
}
