package com.java.oops;

/*so we can implement the similar kind of  implmentation that of method overriding w/o using the keyword extends/inheritance
 * for that we are creating object of that class in which we have same method name 
 * and then calling that method #which is ultimately the concept of inheritance
 * 
 * Inheritance means importing all the fields and methods of a class
 * which can be done by either
 * 1)import pkg, create new instance of that class and then use methods of that class
 * 
 * 2)Or we can simply extend that class using extends keyword which is know as inheritance
 * */

import com.java.oops.Dummy;

class Base {
	
	//Dummy d = new Dummy();
	
	//Child c = new Child();
	
	
	
	void show() {
		//d.show();
		System.out.println("Base Show method");
		//c.show();
	}
}

class Child extends Base{
	
	//Child c = new Child();
	
	
	void show()
	{	
		super.show();
		System.out.println("Child Show method");
	}
}

public class InheritanceDetailedEx {

	public static void main(String[] args) {
		
		Base b = new Child();
		
		//ArrayDemo b1= new Dummy();
		
		b.show();
		
	}
	
}
