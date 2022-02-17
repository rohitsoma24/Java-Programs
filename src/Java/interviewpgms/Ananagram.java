package Java.interviewpgms;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ananagram {
	
	
	static boolean isAnanagram(String a, String b){
		
		char n [] = a.toCharArray();
		char m [] = b.toCharArray();
		
		Arrays.sort(n);
		
		Arrays.sort(m);
		
		//m.equals(n); will return false in case of array
		//because m and n are the two references of two different objects.
		
		if(Arrays.equals(m,n)){
			
			return true;
		}
		else
			return false;
	}
	
	
	public static void main(String[] args) {
						
		String a="Hello", b = "lloeH";
		
		if(Ananagram.isAnanagram(a, b))
		{
			System.out.println("The strings are anangram");
		}
		
		else
			System.out.println("The strings are not anangram");
	}

}
