package org.example.arrays;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static org.example.arrays.Sex.FEMALE;
import static org.example.arrays.Sex.MALE;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(/*new PersonComparator()*/ (o1, o2) -> Comparator.comparing(Person::getName).compare(o1, o2));
        set.add(new Person(18, "Bob", true, MALE));
        set.add(new Person(12, "John", false, MALE));
        set.add(new Person(19, "Anne", false, FEMALE));
        System.out.println(set);
    }

}

class Person implements Comparable<Person> {

    Integer age;
    String name;
    Boolean local;
    Sex sex;

    public Person(Integer age, String name, Boolean local, Sex sex) {
        this.age = age;
        this.name = name;
        this.local = local;
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Boolean getLocal() {
        return local;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public int compareTo(Person o) {
        return Comparator.comparing(Person::getAge)
                .thenComparing(Person::getName)
                .thenComparing(Person::getLocal)
                .thenComparing(Person::getSex)
                .compare(this, o);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", local=" + local +
                ", sex=" + sex +
                '}';
    }

}

enum Sex {

    MALE,
    FEMALE

}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Comparator.comparing(Person::getName)
                .compare(o1, o2);
    }

}
