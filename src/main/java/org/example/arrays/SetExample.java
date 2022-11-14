package org.example.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

    public static void main(String args[]) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Aльфa");
        set.add("Бета");
//        set.add("Aльфa");
        set.add("Этa");
//        set.add("Гaммa");
        set.add("Эпсилон");
        set.add("Oмeгa");
        set.add("Гaммa");
        set.add(null);

        System.out.println(set);
    }

}
