package org.example.arrays;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("Е");
        linkedList.add("C");
        linkedList.addFirst("A");
        linkedList.addLast("Z");
        linkedList.add(1, "А2");

        System.out.println("1. linkedList: " + linkedList);
        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("2. linkedList: " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("3. linkedList: " + linkedList);
        String val = linkedList.get(2);
        linkedList.set(2, val + " изменено");
        System.out.println("4. linkedList: " + linkedList);
    }

}
