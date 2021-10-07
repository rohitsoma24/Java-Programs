package com.java.oops;




class encapsulation {

	public static void main(String args[])
	{
		Student A= new Student();
		Student B= new Student();
		
		A.setId(10);
		A.setName("ABC");
		A.setAddress("XYZ");
		
		System.out.print("ID:  " +  A.getId() +"   Name:   "+  A.getName() +"    Address: "+A.getAddress() );
		
	}
}
