package com.java8.features;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Predicate is functional interface which has only on abstract method test(), which returns boolean

public class PredicateExample {
    public static void main(String args[])
    {
       // simple use case
        Predicate<Integer> isGreaterTen = (n)->n > 10;

        System.out.println("is 20 greater than 10 ==>"+isGreaterTen.test(20));

        // real world use case

        List<String> names = Arrays.asList("Rohit", "Neha", "Rahul");
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        // here filter method of stream takes predicate as argument/ functional interface as argument
        List<String> filterdNames = names.stream().filter(name -> name.startsWith("R")).collect(Collectors.toList());
        List<Integer> filteredNmbers = numbers.stream().filter(n-> n> 10).collect(Collectors.toList());


        System.out.println("Filterd names"+ filterdNames);

    }
}
