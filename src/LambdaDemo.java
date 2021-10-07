interface Math{
	int add(int a,int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		
	
	//int a=10,b=20;
	
	
	 Math ad1=(a,b)->{ return(a+b);};
	 
	 System.out.println(ad1.add(10,20));
}
}