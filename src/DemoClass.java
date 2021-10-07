import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class DemoClass {

	public static void main(String args[]) throws Exception
	{
		Collection values =new ArrayList();
		values.add(3);
		values.add("Rohit");
		values.add(5.8f);
		
		Iterator i= values.iterator();
		
		System.out.println(i.next());
		System.out.println(i.next());
		
		
	}
}
