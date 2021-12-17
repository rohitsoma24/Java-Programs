package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		
		
		List<Integer> li = Arrays.asList(10,30,40,20,10,80,50);
		
		List square = li.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(square);
		
		List sorted = li.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted list "+ sorted);
		
		List filter = li.stream().filter(x->x/2==20).collect(Collectors.toList());
		
		System.out.println("Filtered :"+ filter);
	}
}
