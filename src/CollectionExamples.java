
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionExamples {
	
	public static void main(String[] args) {
		
		//HashSet: insertion order is not maintained
		Set <Integer> s = new HashSet <Integer> ();
		
		s.add(5);
		s.add(1);
		s.add(4);
		s.add(3);
		s.add(2);
		
		Iterator <Integer> i =s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//System.out.println(s);
		
		
		//Arraylist:insertion order is not maintained
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		//Iterator it = s.Iterrator();
		
		
		//Order is not maintained
		Map<Integer, String> M= new HashMap <Integer, String>();
		
		M.put(1, "Rahul");
		M.put(2, "Rohit");
		M.put(3, "Rohan");
		
		//Iterator it =((Object) M).Iterator();
		
		System.out.println("Set view of Keys of the map :"+M.keySet());
		
		//Traversing the Key values Only
		for(Integer key:M.keySet())
		{
			System.out.println(key);
			System.out.println(", ");
		}
		
		//Traversing only values of Map
		for(String V:M.values())
		{
			System.out.println(V);
			System.out.println(", ");
		}
		
		//Iterating through Keys and Values
		for(Entry<Integer, String> entry: M.entrySet()) {
			
			System.out.println(entry);
			System.out.println(", ");
			
		}
	}

}
