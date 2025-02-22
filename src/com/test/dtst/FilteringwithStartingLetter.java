package com.test.dtst;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringwithStartingLetter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice","Bob","Charlie","Ankita");

        List<String> filtedNames =names.stream().filter(name -> !name.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(filtedNames);

    }
}
