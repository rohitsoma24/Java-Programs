package com.java.oops;

class Parent{
	
	int x=10;
	
	//Variable shadowing
	void print()
	{
		int X=20;
		//here x is shadowed
		System.out.println("X vaule after variable shadowing"+x);
	}
}

public class VariableHiding extends Parent{
	public static void main(String[] args) {
		//Variable Hiding: here we are declaring variable with same name as of parents variable
		int x=30;
	
		System.out.println("Variable value in child class:"+x);
		
		//if we want to access variable of parent, we need to use super keyword
		
		Parent p= new VariableHiding();
		//This will print parent value
		System.out.println(" "+p.x);
	
	}
	

}
