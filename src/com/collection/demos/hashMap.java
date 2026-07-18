package com.collection.demos;

import java.util.HashMap;
import java.util.Map;

// Duplicate keys are not allowed in Map
// internal collision occurs when hashcode is same not actual key

public class hashMap {
	
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101,"Rohit");
		hm.put(102, "Neha");
		hm.put(103, "Rahul");
		hm.put(103, "Rahul");
		
		
		System.out.println("Printing ==="+ hm.get(103));
		System.out.println("Printing hashcode=="+hm.get(102).hashCode());
		System.out.println("Printing hashcode=="+hm.get(103).hashCode());
		System.out.println("Printing hashcode=="+hm.get(103).hashCode());
		
		for (Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+ "=="+ m.getValue());
			
		}
		
	}
	
}
