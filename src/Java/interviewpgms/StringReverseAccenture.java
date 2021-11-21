package Java.interviewpgms;

public class StringReverseAccenture {
	
	public static void main(String[] args) {
		
	String org="My name is Rohit";
	
	String[] a=org.split(" ");
	
	String ans="";
	
	for(int i=a.length-1;i>=0;i--)
	{
		
		//System.out.println(a[i]);
		
		ans+=a[i]+" ";
	}
	
	System.out.println("Original:"+org);
	
	System.out.println("Reversed sentence is : "+ans);
	
	
	}
}
