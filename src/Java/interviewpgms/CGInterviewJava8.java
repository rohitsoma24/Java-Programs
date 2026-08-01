package Java.interviewpgms;
// WAP to find first repeating element in string using java8

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CGInterviewJava8 {
    public static void main(String args[]){

        String S = "RohitSoma";

        Optional<Character> firstRepeating = S.chars()           // IntStream of characters
                .mapToObj(c -> (char) c)                             // Convert to Stream<Character>
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,                          // Maintains insertion order
                        Collectors.counting()                        // Counts occurrences
                ))
                .entrySet()
                .stream()                                            // Stream of the map entries
                .filter(entry -> entry.getValue() > 1)               // Keep only repeating elements
                .map(Map.Entry::getKey)                              // Get the character
                .findFirst();                                        // Get the first one

        // Print the result
        if (firstRepeating.isPresent()) {
            System.out.println("First repeating character: " + firstRepeating.get());
        } else {
            System.out.println("No repeating characters found.");
        }

    }

}
