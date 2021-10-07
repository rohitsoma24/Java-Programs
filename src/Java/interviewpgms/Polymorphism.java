package Java.interviewpgms;

class Polymorphism {
	
	public static void sum(Long a, int b)
	{
		System.out.println("sum with int int is called");
		//return a+b;
	}
	public static void sum(int a, Long b)
	{
		System.out.println("sum with Long Long is called");
		//return a+b;
	}
	/*public static int sum(int a, int b)
	{
		
		return a+b;
	}*/
	
	/*public static Long sum(Long a, Long b)
	{
		return a+b;
	}*/

	public static void main(String[] args) {
		
		//Long c = sum(1,1);
		
		/*System.out.println(sum(1L,1L));
		System.out.println(sum(11,10));*/
		
		sum(1L,10);
		sum(1,2L);
	}
}

