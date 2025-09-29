package com.java8.features;

import java.util.*;

public class EPAMStreamsInterview {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "springboot", "microservices", "cloud", "mongodb","microservices");

        // Find the longest word using streams
        String longestWord = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        
        //count the occurrences of longest word
        long count = words.stream()
				.filter(word -> word.equals(longestWord))
				.count();
        
        System.out.println("Occurrences of longest word: " + count);
        
        
     // Find the longest word using Collections.max and a comparator
        String longestWordC = Collections.max(words, Comparator.comparingInt(String::length));

        
        //max is terminal operation in the Stream API.
        //String::length is method reference
        //String::length is a method reference (to the length() method of String).
        //It matches the abstract method of the functional interface ToIntFunction<T> (which comparingInt expects).

        System.out.println("Longest word: " + longestWord);
    }
    
}
