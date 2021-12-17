
class ContsructorChainingEX {
	
	ContsructorChainingEX(){
		this(10);
		System.out.println("Default constructor");
		
	}

	ContsructorChainingEX(int x){
		this(10,20);
		System.out.println("2nd constructor with"+x);
		
	}
	
	ContsructorChainingEX(int x int y){
		System.out.println(x*y);
		
	}
	
	public static void main(String args[])
	{
		new ContsructorChainingEX();
		
	}
}
