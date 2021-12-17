package com.java8.features;

interface MyFunctionalInterface{
	
	int add(int x, int y);
}


public class FunctionalInterfaceEx implements MyFunctionalInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x=10,y=20;

	MyFunctionalInterface mf = (a,b)->(a+b);
	
	System.out.println(mf.add(x,y));
	
	}
}
