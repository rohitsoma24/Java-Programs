package corejava;

/*Object of an interface and abstract class can not be created
-all the variables are static and final in interface
-interface can only have abstract methods
-interface can be used to achieve multiple inheritance
-we can not have constructor 
-we can not declare instance variables i.e non static variables*/
interface mc{
	
	int x=10;
	
	InterfaceExample ob = new InterfaceExample();
	
	void show();
	
	//we can not write sysout in interface
}

public class InterfaceExample implements mc {
	
	public void show(){
		
		System.out.println("Hello MC");
	}
	
	InterfaceExample(){
		
		System.out.println("Hello I am inside InterfaceExample Constructor");
	}
	
	InterfaceExample(int x){
		
		System.out.println("Hello I am parameterized constructor with ::"+x);
	}
	
	public static void main(String[] args) {
		
		
		InterfaceExample obj = new InterfaceExample(x);
		
		
		System.out.println("Hashcode of  obj :: "+obj.hashCode());
		
		System.out.println("Accessing static variable of interface :: "+mc.x);
		
		
		//as all the variables inside interface are static, we can directly access them
		//and as when we try to access ob, it will create a new object of that class, 
		//so constructor of that class will be called
		System.out.println("Accessing variable of type InterfaceExample :: "+mc.ob.hashCode());
	}

}
