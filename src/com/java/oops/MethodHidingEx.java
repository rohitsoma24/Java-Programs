package com.java.oops;

/*we can not Override Static methods, bcz static methods are class methods not instance methods 
 * even if we override static methods, it is known as methods hiding
 * 
 * In case of static method, which method is to be called is decided at compile time only by compiler
 * and overrindg is run time polymorphism, i.e till run time jvm doesnt know which method to call
 * 
 * */

class Foo{
	
	//this method belongs to Foo and not instance of Foo
	public static void display(){
		System.out.println("Static method of Base class Foo");
	}
}

class Bar extends Foo{
	//this method belongs to Bar and not instance of Bar
	public static void display()
	{
		System.out.println("Static method of Child class Bar");
	}
}

public class MethodHidingEx {

	
	public static void main(String[] args) {
		
		//this looks exactly same like overriding but as methods as static instance new Child doesnt matter
		Foo f = new Bar();
		
		//this will call display of Base
		f.display();
	}
}
