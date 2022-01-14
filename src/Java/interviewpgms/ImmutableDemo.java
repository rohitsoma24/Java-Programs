package Java.interviewpgms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


/*Immutable class:
 * 1) make class final, so it cant be extended
 * 2)make all fields as private and final,so they can not be accessed and changed
 * 3)initialize those variables in constructor, perform deep copy in constructor
 * -deep copy means creating a field extensively in constructor and adding values coming from constructor 
 * 4)Provide only getters, and provide clone for non primitives
 * */

final class immutable{
	
	final private int age;
	final  private String name;

	final private HashMap<String, String> hm;
	
	public immutable(int age, String name, HashMap<String, String> hm) {
		super();
		this.age = age;
		this.name = name;
		//this is shallow copy
		//this.hm = hm;
		
		HashMap<String, String> dhm = new HashMap<String, String>();
		
		//this is deep copy, copying elements coming from args to another field of same type
		//dhm.putAll(hm);
		for(Map.Entry<String, String> entry : hm.entrySet()){
			
			dhm.put(entry.getKey(), entry.getValue());
		}
		
		this.hm = dhm;
	}
	
	//clone() will return of type Object thats why we need cast it explicitly
	public HashMap<String, String> getHm() {
		return (HashMap<String, String>) hm.clone();
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}


public class ImmutableDemo {

	public static void main(String[] args) {

		int a=24;
		String n = "Rohit";
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put(n, "10");
		
		immutable im =  new immutable(a,n,hm);
		
		System.out.println("Age :: "+im.getAge() + "\nName :: "+im.getName()+"\nMap :: "+im.getHm());
		//this won't change values in immutable im class, because we performed deep copy
		//in case of shallow copy it changes the values in immutable im class also
		hm.put("MC", "19");
		
		System.out.println("::: After editing :::");
		
		System.out.println("Age :: "+im.getAge() + "\nName :: "+im.getName()+"\nMap :: "+im.getHm());
	}

}
