package com.test.feb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxAge {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person(1 ,"A",30),new Person(2,"B",50),new Person(3,"C",20));

        Optional<Person> oldperson= people.stream().max(Comparator.comparingInt(person -> person.getAge()));

        oldperson.ifPresent(person -> System.out.println("Oldest Person is "+person.getName()));

    }
}
