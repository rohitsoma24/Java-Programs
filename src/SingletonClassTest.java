/*To create a singleton class, we must follow the steps, given below:

1.First, we create the private constructor of the singleton class which prevent from the direct instantiation.
2.Then create the static method also called as getInstance() method which return the single instance of the class. 
returntype of this method has to be of object of singleton class 
This ensure that the only one object is created using lazy intialization
3.Store the instance in the private static variable which make sure that the only single instance is created.

*/

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
