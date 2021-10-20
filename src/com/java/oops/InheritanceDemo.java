package com.java.oops;

/*In the case of method overriding, overriding methods completely replaces the inherited methods,
so when we try to access the method from the parent's reference by holding the child's object, 
the method from the child class gets called.*/


class Animal
{
	int x=10;
	void eat()
	{
		System.out.println("Animal is Eating");
	}
}

class Dog extends Animal
{
	int X= 20;
	void eat()
	{
		System.out.println("dog is eating");
	}
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
//Inheritance means even if we create a instance of dog class, we can access methods of Animal class
// because Dog is child class of Animal
public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		//creating instance of Dog using Dog class
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		
		//Creating instance of Dog using Animal class
		// Here although we are creating instance of child class using parent class refernce
		//parent class reference can only access parent class members
		//Animal a = new Animal();
		Animal a= new Dog();
		//a.bark(); this wont work
		
		// This will call the method of Dog class, because eat() is overridden
		a.eat();
		
		System.out.println("Interger :"+a.x);
	}

}
