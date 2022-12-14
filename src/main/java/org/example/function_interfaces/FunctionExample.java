package org.example.function_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Smith", "Gourav", "John", "Catania");

        Function<String, Integer> nameMappingFunction = String::length;

        List<Integer> nameLength = names.stream()
                .map(nameMappingFunction).collect(Collectors.toList());

        System.out.println(nameLength);
    }

}
