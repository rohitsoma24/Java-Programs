package com.java8.features;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Lambda expression allows us to write code in functional style
// it allows us to implement/represent one method interface(functional interface) using an expression
//an interface which has only one abstract method is called funtional interface

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> Lanuages = Arrays.asList("Java","JavaScript","Python");
        System.out.println("Languages starting with J");

        filter(Lanuages, (str)->str.startsWith("J"));

    }
    // predicate is boolean based funtional interface, it can accept lambda expression as argument
    // functional interface has only one method
    // predicate has test method which is boolean
    public static void filter(List<String> names, Predicate<String> condition)
    {


        for(String name: names){
            if (condition.test(name)){
            System.out.println(name+" ");
            }
        }
    }
}
