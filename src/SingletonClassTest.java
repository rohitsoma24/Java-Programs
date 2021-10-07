
class SingletonExample {
	
	private static SingletonExample In = null;
	
	private SingletonExample()
	{
		
	}
	
	public static SingletonExample getInstance()
	{
		int x=10;
		
		System.out.println(x);
		if(In== null)
		{
			In = new SingletonExample();
		}
		return In;
	}

}

class SingletonClassTest
{
	public static void main(String[] args) {
		
		//getting the SingletonExample instance
		
		SingletonExample x =SingletonExample.getInstance();
		
		SingletonExample y = SingletonExample.getInstance();
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
	}
}
