package ExceptionsDemos;

//Creating custom Exception by extending Exception class
class CustomException extends Exception{
	
	CustomException(String str)
	{
		super(str);
	}
	
}

//creating a class which uses CustomException
class Age
{

	void age(int age) throws CustomException 
	{
		if(age<18)
		{
			throw new CustomException("Age is invalid for voting");
		}
	}
	
}
public class TestCutomException {
	
	public static void main(String[] args) {
		
	int x =13;
	
	Age a = new Age();
	
	//putting code which can throw exceptions in try block
	try {
		a.age(x);
	}
	//catching exception thrown by age method of Age class
	catch(CustomException ex){
		System.out.println("Exception caught:"+ex);
	}
		
	}
	
	
}
