package ExceptionsDemos;

//Java program to demonstrate working of throws
class ThrowsExecp {

	// This method throws an exception
	// to be handled
	// by caller or caller
	// of caller and so on.
	 static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}

	public static void add() throws IllegalAccessException
	{
		System.out.println("Inside add()");
	 fun();
	}
	
	// This is a caller function
	public static void main(String args[])
	{
		try {
			add();
			//fun();
		}
		catch (IllegalAccessException e) {
			System.out.println("caught in main.");
		}
	
	
	}


}
