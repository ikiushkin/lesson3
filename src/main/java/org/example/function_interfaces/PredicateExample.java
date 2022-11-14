package org.example.function_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Smith", "Samueal", "Catley", "Sie", "Tuuuie", "Rie");

        Predicate<String> startPredicate = str -> str.startsWith("S");

        Predicate<String> lengthPredicate = str -> str.length() >= 5;

//        names.stream()
//                .filter(startPredicate)
//                .forEach(System.out::println);

        names.stream()
                .filter(str -> (str.startsWith("S") || str.startsWith("T")) && str.length() >= 5)
                .forEach(System.out::println);
    }

}
