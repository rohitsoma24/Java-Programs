
public class AmazonTest {

	public static void main(String[] args) {
		
		int N = 867,temp,n,count=0,digit;
		
		int a[] = null;
		
		int j=0;
		
		n=N;
		
		/*public static void recursion(int number){
		    if(number > 0) {
		        recursion(number/10);
		        System.out.printf("%d   ", (number%10));
		    }
		}
		*/
		temp=n;  
		//the loop determines the position of the digit  
		while(n>0)  
		{  
		//dividing the number by 10  
		n=n/10;  
		//increments the count variable by 1  
		count++;  
		}  
		//the loop breaks the number into digits  
		while(temp > 0)  
		{  
		//finding the remainder  
		digit=temp%10;  
		//prints the position and digit  
		
		System.out.println("Digit at place "+count+" is: "+digit); 
		// a[j]=digit;
		temp=temp/10;  
		//decrements the digit by 1  
		count--;  
		//j++;
		
		} 
		
		/*for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}*/
		}  
		
	
	}
