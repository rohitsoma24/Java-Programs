import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoString {
	
	public static void main(String[] args) {
	
		/*int a[]={1,2,5,6,8,3}; 
		
		
		System.out.println(a.length);*/
		/*int count;
		
		for(int i=0;i<a.length;i++)*/
		
		
		
		 /* String s1 = "abc";
	        String s2 = "abc";
	        String s3= new String("abc");
	        System.out.println("s1 == s2: "+(s1==s2)); 
	        System.out.println("s1 == s3 : "+(s1==s3)); 
	        System.out.println("s1 equals s3 : "+(s1.equals(s3)));*/
	        
	     String str ="Mindtree";
	     
	   /*  StringBuilder sb = new StringBuilder(str);
	     
	     sb.reverse();
	     
	     sb.toString();
	     
	     System.out.println(sb);*/
	     
	     char ch[]=str.toCharArray();
	     
	     String rev="";
	     
	     for(int i=str.length()-1;i>=0;i--)
	     {
	    	 rev+=ch[i];
	     }
	     System.out.println(rev);
	
	}
	
}
