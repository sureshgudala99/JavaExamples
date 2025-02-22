package com.test.samples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("apple","banana","grapes","dragonfruit");

        List<Person> persons =Arrays.asList(new Person("sachin",50),new Person("Virat",40),new Person("Rohit",30));

    // Optional<String> lStr= str.stream().max(Comparator.comparingInt(String::length));
    // System.out.println(lStr);
        double average =persons.stream().mapToInt(Person::getAge).average().orElse(0);

        System.out.println(average);





    }

}
