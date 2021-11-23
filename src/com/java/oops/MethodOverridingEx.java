package com.java.oops;

/*Method Overriding also known as run time polymorphism, 
the main use is : child class can provide its own implementaion of overriding methods
and the main thing is we can call child class's method using parent class refernence i,e Base b = new Child()
Base b = new Child()
in this case we can call overriding method of Child class not other methods which are not overridden

we can not Override private, static, final methods
*/

class Base{
	
	public void display(){
		System.out.println("Base class method");
	}
	
	public void Bdisplay(){
		
		System.out.println("other Display of Base which is not overridden");
	}
}

class Child extends Base{
	
	public void display()
	{
		System.out.println("Child class method");
	}
	
	//this method we can not call using refernce of parent class
	public void otherDisplay()
	{
		System.out.println("Child classes other display");
	}
}

public class MethodOverridingEx {
	
	public static void main(String[] args) {
		// All these will work even if we dont inherit the class
		//Base b = new Base();
		//Child c = new Child();
		
		//b.display();
		//c.display();
		
		//this is the reason we use polymorphism
		//using base class ref to call child class method
		Base b = new Child();
		
		b.display();
		
		//this we can not call
		//b.otherDisplay();
		
		
	}

}
