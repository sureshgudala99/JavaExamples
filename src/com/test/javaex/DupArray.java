package com.test.javaex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DupArray {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);


        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Set<Integer> uniqueElements = new HashSet<>();

        Set<String> dupChars = new HashSet<>();

        Arrays.stream(inputString.split("")).filter(i ->!dupChars.add(i)).collect(Collectors.toSet()).forEach(System.out::println);

        listOfIntegers.stream().filter(i -> !uniqueElements.add(i)).collect(Collectors.toSet()).forEach(System.out::println);



    }
}
