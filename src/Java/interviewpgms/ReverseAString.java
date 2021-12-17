package Java.interviewpgms;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String str="HelloPeter";
		
		String rev="";
		
		char c[]=str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev+=c[i];
		}
		System.out.println("Reversed String is "+rev);
	}
}
