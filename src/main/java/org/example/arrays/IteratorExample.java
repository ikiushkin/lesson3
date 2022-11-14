package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "C", "A", "A", "B", "C", "B"));

//        try {
//            for (String s : list) {
//                if (s.equals("C")) {
//                    list.remove(s);
//                }
//                System.out.println(s);
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals("C")) {
                iter.remove();
            }
        }
        System.out.println(list);
    }

}
