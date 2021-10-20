package ExceptionsDemos;

//Unchecked exceptions are those exceptions which are not known to compiler
//Here when we save the file it doent tell us to handle the ArrayIndexOutOfBoundsException
//But when we run this application, it throws ArrayIndexOutOfBoundsException at line 16
// we can handle Unchecked Exceptions by try catch
import java.io.*;

class UncheckedEx {

	// Main Driver Function
	public static void main(String[] args)
	{
		// Array containing 4 elements
		int a[] = { 1, 2, 3, 4 };

		// Try to access elements greater than
		// index size of the array
		System.out.println(a[5]);
	}
}
