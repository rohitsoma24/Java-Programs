package InterfaceDemos;

//Interface can only have abstract methods i.e only method declaration
//We can not create instance of interface
interface Iterator{
	
	void print();
}

//We should have a class that provide implementations to methods of the interface
class childList implements Iterator{

	@Override
	public void print() {
	System.out.println("This is childList");
		
	}
	
	public Iterator  it()
	{
		System.out.println("I am in It");
		return null;
	}
	
}

public class Test {
	public static void main(String[] args) {
	
		childList cl= new childList();
		
		Iterator itr = cl.it();
		
		//here  we are creating reference variable of Iterator interface,
		//we are not creating instance of Iterator interface, because we can not create instance of an interface
		Iterator itr1 = cl;
		
		itr1.print();
		
	}

	
	

}
